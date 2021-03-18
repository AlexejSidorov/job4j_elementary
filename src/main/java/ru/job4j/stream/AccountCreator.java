package ru.job4j.stream;

import java.util.Date;

public class AccountCreator {
    public static void main(String[] args) {
        Account account = new Account.Builder()
                .buildFullName("Alexey Sidorov")
                .buildNickName("Alex")
                .buildAmount(3320)
                .buildRang(9)
                .buildData(new Date())
                .build();

        System.out.println(account.toString());
    }
}
