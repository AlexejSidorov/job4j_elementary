package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс является описанием счёта пользователя {@link User}
 *
 * @author Sidorov Aleksey
 * @version 1.0
 */

public class Account {

    /**
     * Поле уникального идентификатора объекта
     */
    private String requisite;

    /**
     * Поле показатель колличества денег на счету
     */
    private double balance;

    /**
     * Конструктор - создние нового объекта со входными параметрами
     *
     * @param requisite идентификатор
     * @param balance колличество денег
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод возвращает поле {@link Account#requisite}
     *
     * @return {@link Account#requisite} идентификатор
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод меняет значение поля {@link Account#requisite}
     * на входной параметр
     *
     * @param requisite новый идентификатор
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод возвращает поле {@link Account#balance}
     *
     * @return {@link Account#balance} колличество денег
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод изменяет значение поля {@link Account#balance}
     * на входное значение
     *
     * @param balance новое колличество денег
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Переопределение метода {@link Objects#equals(Object, Object)}
     * для сравнения с другим объектом класса {@link Account}
     *
     * @param o другой объект класса {@link Account}
     * @return {@link boolean}
     *  true - если объекты равны, иначе - false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Переопределение метода {@link Objects#hashCode()}
     *
     * @return {@link int} hashCode объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}