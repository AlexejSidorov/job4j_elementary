package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccounts = users.get(user);
            if (!userAccounts.contains(account)) {
                users.get(user).add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        User srcUser = findByPassport(srcPassport);
        User destUser = findByPassport(destPassport);
        if (srcUser == null || destUser == null) {
            return false;
        }
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        int srcIndexAccount = users.get(srcUser).indexOf(srcAccount);
        int destIndexAccount = users.get(destUser).indexOf(destAccount);
        if (srcIndexAccount != -1 && destIndexAccount != -1 && srcAccount.getBalance() >= amount) {
            double srcBalance = srcAccount.getBalance();
            double destBalance = destAccount.getBalance();
            users.get(srcUser).get(srcIndexAccount).setBalance(srcBalance - amount);
            users.get(destUser).get(destIndexAccount).setBalance(destBalance + amount);
            return true;
        }
        return false;
    }
}