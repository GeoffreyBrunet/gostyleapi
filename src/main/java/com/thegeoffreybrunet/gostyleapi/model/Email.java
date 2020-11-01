package com.thegeoffreybrunet.gostyleapi.model;

public class Email {
    private int idEmail;
    private String emailAddress;

    public Email(int idEmail, String emailAdress) {
        this.idEmail = idEmail;
        this.emailAddress = emailAdress;
    }

    public int getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(int idEmail) {
        this.idEmail = idEmail;
    }

    public String getEmailAdress() {
        return emailAddress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAddress = emailAdress;
    }

    @Override
    public String toString() {
        return "Email{" +
                "idEmail=" + idEmail +
                ", emailAdress='" + emailAddress + '\'' +
                '}';
    }
}
