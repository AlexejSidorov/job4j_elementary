package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int nullIndex = 0; nullIndex < array.length; nullIndex++) {
            if (array[nullIndex] == null) {
                for (int notNullIndex = nullIndex + 1; notNullIndex < array.length; notNullIndex++) {
                    if (array[notNullIndex] != null) {
                        array[nullIndex] = array[notNullIndex];
                        array[notNullIndex] = null;
                        break;
                    }
                }
            }
            System.out.print(array[nullIndex] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}
