package com.thegeoffreybrunet.gostyleapi.model;

public class Promotion {
    private int idPromo;
    private String reduc;
    private String urlCode;

    public Promotion(int idPromo, String reduc, String urlCode) {
        this.idPromo = idPromo;
        this.reduc = reduc;
        this.urlCode = urlCode;
    }

    public int getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(int idPromo) {
        this.idPromo = idPromo;
    }

    public String getReduc() {
        return reduc;
    }

    public void setReduc(String reduc) {
        this.reduc = reduc;
    }

    public String getUrlCode() {
        return urlCode;
    }

    public void setUrlCode(String urlCode) {
        this.urlCode = urlCode;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "idPromo=" + idPromo +
                ", reduc='" + reduc + '\'' +
                ", urlCode='" + urlCode + '\'' +
                '}';
    }
}
