package com.mybuilds.digiwallet.entity;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
public class Transaction {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionNum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    protected Transaction() {}

    public Transaction(Account account, String description, String category, BigDecimal amount) {
        this.account = account;
        this.description = description;
        this.category = category;
        this.amount = amount;
    }

    // Getters

    public Long getTransactionNum() {
        return this.transactionNum;
    }

    public Account getAccount() {
        return this.account;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCategory() {
        return this.category;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    // Setters
    public void setAccount(Account account) {
        this.account = account;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    
    
}
