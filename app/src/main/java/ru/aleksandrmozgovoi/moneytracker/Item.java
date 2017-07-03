package ru.aleksandrmozgovoi.moneytracker;

/**
 * Created by AleksandrMozgovoy on 23.06.2017.
 */

public class Item {
    public static final String TYPE_EXPENSE = "expense";
    public static final String TYPE_INCOME = "income";

    int price;
    int id;
    String name;
    String type;


    public Item(String name, int price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
}
