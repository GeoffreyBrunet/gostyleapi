package com.thegeoffreybrunet.gostyleapi.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_product;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "price")
    private int price;

    @Column(name = "picture")
    private String picture;

    public Product() {
    }

    public Product(String product_name, int price, String picture) {
        this.product_name = product_name;
        this.price = price;
        this.picture = picture;
    }

    public long getId_product() {
        return id_product;
    }

    public void setId_product(long id_product) {
        this.id_product = id_product;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id_product=" + id_product +
                ", product_name='" + product_name + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                '}';
    }
}
