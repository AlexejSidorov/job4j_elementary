package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {

    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );

        Comparator<Attachment> comparator = (left, right) -> {
            System.out.println(new StringBuilder("compare- ")
            .append(right.getName())
            .append(" : ")
            .append(left.getName()));
            return right.getName().compareTo(left.getName());
        };

        Collections.sort(attachments, comparator);
        for (Attachment attach : attachments) {
            System.out.println(attach.getName());
        }
    }
}
