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

    public Email(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public long getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(long id_email) {
        this.idEmail = id_email;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String email_address) {
        this.emailAddress = email_address;
    }

    @Override
    public String toString() {
        return "Email{" +
                "id_email=" + idEmail +
                ", email_address='" + emailAddress + '\'' +
                '}';
    }
}
