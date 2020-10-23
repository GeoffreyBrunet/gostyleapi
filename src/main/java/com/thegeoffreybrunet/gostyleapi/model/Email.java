package com.thegeoffreybrunet.gostyleapi.model;

public class Email {
    private int idEmail;
    private String emailAdress;

    public Email(int idEmail, String emailAdress) {
        this.idEmail = idEmail;
        this.emailAdress = emailAdress;
    }

    public int getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(int idEmail) {
        this.idEmail = idEmail;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    @Override
    public String toString() {
        return "Email{" +
                "idEmail=" + idEmail +
                ", emailAdress='" + emailAdress + '\'' +
                '}';
    }
}
