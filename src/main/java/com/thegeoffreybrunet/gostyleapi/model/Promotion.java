package com.thegeoffreybrunet.gostyleapi.model;

public class Promotion {
    private int idPromo;
    private String productName, oldPrice, newPrice, picture;

    public Promotion(int idPromo, String productName, String oldPrice, String newPrice, String picture) {
        this.idPromo = idPromo;
        this.productName = productName;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
        this.picture = picture;
    }

    public int getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(int idPromo) {
        this.idPromo = idPromo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "idPromo=" + idPromo +
                ", productName='" + productName + '\'' +
                ", oldPrice='" + oldPrice + '\'' +
                ", newPrice='" + newPrice + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
