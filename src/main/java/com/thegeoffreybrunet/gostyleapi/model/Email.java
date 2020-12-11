package com.thegeoffreybrunet.gostyleapi.model;

public class Email {
    private int id_email;
    private String email_address;

    public Email(int id_email, String email_address) {
        this.id_email = id_email;
        this.email_address = email_address;
    }

    public int getId_email() {
        return id_email;
    }

    public void setId_email(int id_email) {
        this.id_email = id_email;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }
}
