package com.thegeoffreybrunet.gostyleapi.model;

import javax.persistence.*;

@Entity
@Table(name = "emails")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_email;

    @Column(name = "email_address")
    private String email_address;

    public Email() {
    }

    public Email(String email_address) {
        this.email_address = email_address;
    }

    public long getId_email() {
        return id_email;
    }

    public void setId_email(long id_email) {
        this.id_email = id_email;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    @Override
    public String toString() {
        return "Email{" +
                "id_email=" + id_email +
                ", email_address='" + email_address + '\'' +
                '}';
    }
}
