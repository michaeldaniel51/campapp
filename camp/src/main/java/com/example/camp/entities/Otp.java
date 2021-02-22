package com.example.camp.entities;

import com.example.camp.entities.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

public class Otp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "Your Token Is!!!")
    @Column(name = "Token")
    private long token;

    @JoinColumn(name = "USER_OTP")
    @OneToOne
    private User user;


    public Otp(long id, @NotNull(message = "Your Token Is!!!") long token, User user) {
        this.id = id;
        this.token = token;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getToken() {
        return token;
    }

    public void setToken(long token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "Otp{" +
                "id=" + id +
                ", token=" + token +
                ", user=" + user +
                '}';
    }
}
