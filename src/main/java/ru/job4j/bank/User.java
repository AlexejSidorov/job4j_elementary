package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает пользователя банка {@link BankService}
 */
public class User {

    /**
     * Паспорт (идентификатор) пользователя {@link User}
     */
    private String passport;

    /**
     * Имя пользователя {@link User}
     */
    private String username;

    /**
     * Конструктор - создние нового объекта со входными параметрами
     *
     * @param passport паспорт пользователя
     * @param username имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод возвращает поле {@link User#passport}
     *
     * @return {@link User#passport} паспорт пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод меняет значение поля {@link User#passport}
     * на входной параметр
     *
     * @param passport новый паспорт пользователя
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод возвращает поле {@link User#username}
     *
     * @return {@link User#username} имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод меняет значение поля {@link User#username}
     * на входной параметр
     *
     * @param username новое имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределение метода {@link Objects#equals(Object, Object)}
     * для сравнения с другим объектом класса {@link User}
     *
     * @param o другой объект класса {@link User}
     * @return {@link boolean}
     *  true - если объекты, иначе - false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Переопределение метода {@link Objects#hashCode()}
     *
     * @return {@link int} hashCode объекта
     */
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}