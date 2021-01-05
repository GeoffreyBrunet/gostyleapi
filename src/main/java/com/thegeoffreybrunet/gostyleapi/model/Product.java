package com.thegeoffreybrunet.gostyleapi.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idProduct;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "price")
    private int price;

    @Column(name = "picture")
    private String picture;

    public Product() {
    }

    public Product(String productName, int price, String picture) {
        this.productName = productName;
        this.price = price;
        this.picture = picture;
    }

    public long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(long id_product) {
        this.idProduct = id_product;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String product_name) {
        this.productName = product_name;
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
                "id_product=" + idProduct +
                ", product_name='" + productName + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                '}';
    }
}
