package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private String factory;
    private double price;

    public Product() {
    }

    public Product(int id, String name, String factory, double price) {
        this.id = id;
        this.name = name;
        this.factory = factory;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
