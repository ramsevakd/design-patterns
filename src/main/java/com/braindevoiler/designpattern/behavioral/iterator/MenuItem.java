package com.braindevoiler.designpattern.behavioral.iterator;

public class MenuItem {
    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final double price;

    public MenuItem(String name,
            String description,
            boolean vegetarian,
            double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name + ",\n" + this.description + ",\n" + this.price + ",\n" + this.vegetarian + "\n";
    }
}
