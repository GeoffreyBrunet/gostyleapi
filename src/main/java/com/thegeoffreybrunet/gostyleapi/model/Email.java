package com.thegeoffreybrunet.gostyleapi.model;

import javax.persistence.*;

@Entity
@Table(name = "emails")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmail;

    @Column(name = "email_address")
    private String emailAddress;

    public Email() {
    }

    public Email(long idEmail, String emailAddress) {
        this.idEmail = idEmail;
        this.emailAddress = emailAddress;
    }

    public long getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(long idEmail) {
        this.idEmail = idEmail;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Email{" +
                "idEmail=" + idEmail +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
