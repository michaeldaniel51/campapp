package com.example.camp.entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Transaction {


    @Id
    private String id;

    @NotNull
    @Column(name = "AMOUNT")
    private int amount;

    @NotNull
    @Column(name = "TYPE")
    private String type;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private  User user;

    public Transaction(String id, int amount, String type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }

    public Transaction() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }
}
