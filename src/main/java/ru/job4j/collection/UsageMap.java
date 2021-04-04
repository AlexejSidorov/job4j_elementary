package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("myFirstEMail@mail.com", "John Doe");
        map.put("mySecondEMail@mail.com", "John Doe");
        map.put("myEMail@mail.com", "Jane Doe");
        map.put("work@mail.com", "Edvard Dodjson");

        for (Map.Entry<String, String> mailName : map.entrySet()) {
            System.out.println(new StringBuilder()
                    .append(mailName.getKey())
                    .append(" ")
                    .append(mailName.getValue())
                    .toString());
        }
    }
}
