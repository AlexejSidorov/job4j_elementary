package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("Element \"" + key + "\" is not exist");
    }

    public static void main(String[] args) {
        try {
            int k = indexOf(new String[]{"lol", "pil", "err", "jok"}, "lel");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}