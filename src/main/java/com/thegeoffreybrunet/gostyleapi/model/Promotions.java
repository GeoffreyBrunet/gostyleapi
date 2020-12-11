package com.thegeoffreybrunet.gostyleapi.model;

public class Promotions {
    private double taux_promotion;
    private String qrcode_promo;
    private int id_product;

    public Promotions(double taux_promotion, String qrcode_promo, int id_product) {
        this.taux_promotion = taux_promotion;
        this.qrcode_promo = qrcode_promo;
        this.id_product = id_product;
    }

    public double getTaux_promotion() {
        return taux_promotion;
    }

    public void setTaux_promotion(double taux_promotion) {
        this.taux_promotion = taux_promotion;
    }

    public String getQrcode_promo() {
        return qrcode_promo;
    }

    public void setQrcode_promo(String qrcode_promo) {
        this.qrcode_promo = qrcode_promo;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }
}
