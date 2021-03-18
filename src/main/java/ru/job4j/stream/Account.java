package ru.job4j.stream;

import java.util.Date;

public class Account {

    private String fullName;
    private String nickName;
    private Integer amount;
    private Integer rang;
    private Date date;

    @Override
    public String toString() {
        return "Account{"
                + "fullName='" + fullName + '\''
                + ", nickName='" + nickName + '\''
                + ", amount=" + amount
                + ", rang=" + rang
                + ", date=" + date
                + '}';
    }

    static class Builder {
        private String fullName;
        private String nickName;
        private Integer amount;
        private Integer rang;
        private Date date;

        public Builder buildFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder buildNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        public Builder buildAmount(Integer amount) {
            this.amount = amount;
            return this;
        }

        public Builder buildRang(Integer rang) {
            this.rang = rang;
            return this;
        }

        public Builder buildData(Date date) {
            this.date = date;
            return this;
        }

        Account build() {
            Account account = new Account();
            account.fullName = fullName;
            account.nickName = nickName;
            account.amount = amount;
            account.rang = rang;
            account.date = date;
            return account;
        }
    }
}
