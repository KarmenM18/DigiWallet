package com.mybuilds.digiwallet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;

import jakarta.persistence.Column;


@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "account_id", nullable = false)
    private Long accountID;

    @Column(name = "acct_type", nullable = false)
    private String accountType;

    @Column(name = "bank_name", nullable = false)
    private String bankName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    protected Account() {}


    public Account(String accountType, String bankName, User user) {
        this.accountType = accountType;
        this.bankName = bankName;
        this.user = user;
    }

    // Getters

    public Long getAccountID() {
        return accountID;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public String getBankName() {
        return this.bankName;
    }

    public User getUser() {
        return this.user;
    }
    
    // Setters
    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    // prob wont need this
    public void setUser(User user) {
        this.user = user;
    }

}
