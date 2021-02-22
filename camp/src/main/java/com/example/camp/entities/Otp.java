package com.example.camp.entities;

import org.hibernate.id.UUIDGenerationStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public class Otp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "Your Token Is!!!")
    @Column(name = "Token")
    private long otpToken= UUID.randomUUID().getMostSignificantBits();

    @JoinColumn(name = "USER_OTP")
    @OneToOne
    private User user;


    public Otp(long id, @NotNull(message = "Your Token Is!!!") long token, @NotNull(message = "Your Token Is!!!") long otptoken, User user) {
        this.id = id;
        otpToken = otpToken;
        this.otpToken = otpToken;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getToken() {
        return otpToken;
    }

    public void setToken(long token) {
        this.otpToken = otpToken;
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
                ", otpToken=" + otpToken +
                ", user=" + user +
                '}';
    }
}
