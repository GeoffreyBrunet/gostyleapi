package com.thegeoffreybrunet.gostyleapi.model;

public class Item {
    private int idProduct;
    private String productName;
    private String produtcPicture;
    private double productPrice;

    public Item(int idProduct, String productName, String produtcPicture, double productPrice) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.produtcPicture = produtcPicture;
        this.productPrice = productPrice;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProdutcPicture() {
        return produtcPicture;
    }

    public void setProdutcPicture(String produtcPicture) {
        this.produtcPicture = produtcPicture;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "idProduct=" + idProduct +
                ", productName='" + productName + '\'' +
                ", produtcPicture='" + produtcPicture + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
