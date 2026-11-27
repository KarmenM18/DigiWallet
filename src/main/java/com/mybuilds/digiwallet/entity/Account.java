package com.mybuilds.digiwallet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;


@Entity
public class Account {

    @Id
    @Column(name = "bank_id", nullable = false)
    private Long bankID;

    @Column(name = "service_name", nullable = false)
    private String serviceName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private Long userID;

    public Account(Long bankID, String serviceName, Long userID) {
        this.bankID = bankID;
        this.serviceName = serviceName;
        this.userID = userID;
    }

    public Long getBankdID() {
        return this.bankID;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public Long getUserID() {
        return this.userID;
    }
    
}
