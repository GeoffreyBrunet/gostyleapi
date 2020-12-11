package com.thegeoffreybrunet.gostyleapi.model;

public class Product {
    private String product_name;
    private double price;
    private String picture;

    public Product(String product_name, double price, String picture) {
        this.product_name = product_name;
        this.price = price;
        this.picture = picture;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
