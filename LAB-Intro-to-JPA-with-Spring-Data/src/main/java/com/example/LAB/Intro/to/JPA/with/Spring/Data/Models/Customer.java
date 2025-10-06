package com.example.LAB.Intro.to.JPA.with.Spring.Data.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private CustomerStatus status;

    private Integer mileage;

    public Customer(String firstName, String lastName, CustomerStatus status, Integer mileage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.mileage = mileage;
    }

    public Customer() {}

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(String lastName) {
        return lastName;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public Integer getMileage() {
        return mileage;
    }
}
