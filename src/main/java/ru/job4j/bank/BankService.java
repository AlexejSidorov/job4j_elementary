package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает связь объектов {@link User} с объектами {@link Account},
 * и дает возможность перевести денги с баданса обного объекта {@link Account} на другой
 */
public class BankService {
    /**
     * Поле в качестве ключей использует объекты {@link User},
     * а в качестве хранимого объекта - список {@link ArrayList<Account>}
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет входящий объект в {@link BankService#users}
     * в качестве ключа
     * и создает пустой список {@link ArrayList<Account>}
     * как хранимый объект,
     * если такого еще в списке нет
     *
     * @param user пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод с помощью {@link BankService#findByPassport(String)}
     * по входящему passport находит объект класса {@link User},
     * если он существует в {@link BankService#users},
     * то проверяется связанный список аккаунтов
     * на отсутсвие входного account, и если такого
     * нет, то он добавляется
     *
     * @param passport пасспорт объекта {@link User}
     * @param account  объект класса {@link Account}
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> userAccounts = users.get(user.get());
            if (!userAccounts.contains(account)) {
                users.get(user.get()).add(account);
            }
        }
    }

    /**
     * Метод находит объект {@link User} в {@link BankService#users}
     * и возвращает его.
     * Обьект определяется по входному passport.
     * Если такого обьекта нет, то возвращается null
     *
     * @param passport паспорт (идентификатор) объекта {@link User}
     * @return user - обьект класса {@link User}, или null
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод находит обьект класса {@link Account} и возвращает его.
     * По входному passport находится ключ {@link User} из {@link BankService#users},
     * по ключу находится {@link ArrayList<Account>} из {@link BankService#users},
     * по входному  requisite находиться возвращаемый account из {@link ArrayList<Account>}
     * Если ключ {@link User} или обьект {@link Account} не существуют в {@link BankService#users} -
     * возвращается null
     *
     * @param passport  паспорт (идентификатор) объекта {@link User}
     * @param requisite идентификатор объекта {@link Account}
     * @return account объект {@link Account}, или null
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user.get()).stream()
                    .filter(acc -> acc.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
    }

    /**
     * Метод переводит часть денег amount с одного объекта {@link Account}
     * на другой.
     * По srcPassport и destPassport определяются ключи-объекты {@link User}
     * из {@link BankService#users}, по srcRequisite и destRequisite
     * определяются аккаунты {@link Account}, и balance одного аккаунта становиться меньше
     * на amount, а баланс другого - больше, при удачной операции возвращается true.
     * Если один из {@link User} не найден, или один из аккаунтов {@link Account} не найден,
     * или сумма перевода больше баланса первого аккаунта, то перевод не осуществляется и возвращается false.
     *
     * @param srcPassport   паспорт объекта {@link User} с которого спишут деньги
     * @param srcRequisite  идентификатор объекта {@link Account} с которого спишут деньги
     * @param destPassport  паспорт объекта {@link User} на который зачислят деньги
     * @param destRequisite идентификатор объекта {@link Account} на который зачислят деньги
     * @param amount        колличество списываемых/зачисляемых денег
     * @return boolean true - если операция прошла успешно, иначе - false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Optional<Account> srcOptional = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destOptional = findByRequisite(destPassport, destRequisite);
        if (srcOptional.isPresent() && destOptional.isPresent() && srcOptional.get().getBalance() >= amount) {
            Account srcAccount = srcOptional.get();
            Account destAccount = destOptional.get();
            double srcBalance = srcAccount.getBalance();
            double destBalance = destAccount.getBalance();
            srcAccount.setBalance(srcBalance - amount);
            destAccount.setBalance(destBalance + amount);
            return true;
        }
        return false;
    }
}