package com.example.LAB.Intro.to.JPA.with.Spring.Data.Models;

import jakarta.persistence.*;

import java.lang.reflect.Field;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String number;

    private String aircraft;

    @Column(name = "total_seats")
    private Integer totalSeats;

    private Integer mileage;

    public Flight(String number, String aircraft, Integer totalSeats, Integer mileage) {
        this.number = number;
        this.aircraft = aircraft;
    }

    public Flight() {}

    public Integer getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getAircraft() {
        return aircraft;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }
    public Integer getMileage() {
        return mileage;
    }
}
