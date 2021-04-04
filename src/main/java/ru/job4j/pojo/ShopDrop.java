package ru.job4j.pojo;

public class ShopDrop {

    public static Product[] leftShift(Product[] products, int index) {
        for (int i = index + 1; i < products.length; i++) {
            products[i - 1] = products[i];
            products[i] = null;
        }
        products[products.length - 1] = null;
        return products;
    }
}
