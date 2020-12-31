package com.thegeoffreybrunet.gostyleapi.model;

import javax.persistence.*;

@Entity
@Table(name = "promotions")
public class Promotions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_promo;

    @Column(name = "taux_promotion")
    private String email_address;

    @Column(name = "qrcode_promo")
    private String qrcode_promo;

    @Column(name = "id_product")
    private int id_product;

    public Promotions() {
    }

    public Promotions(String email_address, String qrcode_promo, int id_product) {
        this.email_address = email_address;
        this.qrcode_promo = qrcode_promo;
        this.id_product = id_product;
    }

    public long getId_promo() {
        return id_promo;
    }

    public void setId_promo(long id_promo) {
        this.id_promo = id_promo;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
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

    @Override
    public String toString() {
        return "Promotions{" +
                "id_promo=" + id_promo +
                ", email_address='" + email_address + '\'' +
                ", qrcode_promo='" + qrcode_promo + '\'' +
                ", id_product=" + id_product +
                '}';
    }
}
