package com.thegeoffreybrunet.gostyleapi.model;

import javax.persistence.*;

@Entity
@Table(name = "promotions")
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPromo;

    @Column(name = "taux_promotion")
    private String tauxPromotion;

    @Column(name = "qrcode_promo")
    private String qrcodePromo;

    @Column(name = "product_id")
    private int productId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private Product product;

    public Promotion() {
    }

    public Promotion(long idPromo, String tauxPromotion, String qrcodePromo, int productId, Product product) {
        this.idPromo = idPromo;
        this.tauxPromotion = tauxPromotion;
        this.qrcodePromo = qrcodePromo;
        this.productId = productId;
        this.product = product;
    }

    public long getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(long idPromo) {
        this.idPromo = idPromo;
    }

    public String getTauxPromotion() {
        return tauxPromotion;
    }

    public void setTauxPromotion(String tauxPromotion) {
        this.tauxPromotion = tauxPromotion;
    }

    public String getQrcodePromo() {
        return qrcodePromo;
    }

    public void setQrcodePromo(String qrcodePromo) {
        this.qrcodePromo = qrcodePromo;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "idPromo=" + idPromo +
                ", tauxPromotion='" + tauxPromotion + '\'' +
                ", qrcodePromo='" + qrcodePromo + '\'' +
                ", productId=" + productId +
                ", product=" + product +
                '}';
    }
}
