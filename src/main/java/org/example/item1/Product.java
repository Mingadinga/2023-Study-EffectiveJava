package org.example.item1;

public class Product {
    public static void main(String[] args) {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        System.out.println(settings1.equals(settings2));

        Boolean.valueOf(false);
    }
}
