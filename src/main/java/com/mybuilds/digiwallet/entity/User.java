package com.mybuilds.digiwallet.entity;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;

import jakarta.persistence.*;



@Entity
@Table(name = "app_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    protected User() {}


    public User(String name) {
        this.name = name;

    }

    // Getters

    public String getName() {
        return this.name;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }
    
}
