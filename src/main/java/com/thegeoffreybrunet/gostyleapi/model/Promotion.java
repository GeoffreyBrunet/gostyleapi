package com.thegeoffreybrunet.gostyleapi.model;

import javax.persistence.*;

@Entity
@Table(name = "promotions")
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPromo;

    @Column(name = "taux_promotion")
    private String emailAddress;

    @Column(name = "qrcode_promo")
    private String qrcodePromo;

    @Column(name = "id_product")
    private int idProduct;

    public Promotion() {
    }

    public Promotion(String emailAddress, String qrcodePromo, int idProduct) {
        this.emailAddress = emailAddress;
        this.qrcodePromo = qrcodePromo;
        this.idProduct = idProduct;
    }

    public long getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(long id_promo) {
        this.idPromo = id_promo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String email_address) {
        this.emailAddress = email_address;
    }

    public String getQrcodePromo() {
        return qrcodePromo;
    }

    public void setQrcodePromo(String qrcode_promo) {
        this.qrcodePromo = qrcode_promo;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int id_product) {
        this.idProduct = id_product;
    }

    @Override
    public String toString() {
        return "Promotions{" +
                "id_promo=" + idPromo +
                ", email_address='" + emailAddress + '\'' +
                ", qrcode_promo='" + qrcodePromo + '\'' +
                ", id_product=" + idProduct +
                '}';
    }
}
