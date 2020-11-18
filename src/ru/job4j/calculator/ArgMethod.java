package ru.job4j.calculator;

public class ArgMethod {

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        ArgMethod.hello();
        ArgMethod.hello(name);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, name, name);
    }

    public static void hello() {
        System.out.println("Hello");
    }

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", " + age);
    }

    public static void hello(String name, String name1, String name2) {
        System.out.println("Hello, " + name + ", " + name1 + ", " + name2);
    }
}
