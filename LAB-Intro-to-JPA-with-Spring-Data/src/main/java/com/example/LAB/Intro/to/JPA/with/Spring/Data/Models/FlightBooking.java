package com.example.LAB.Intro.to.JPA.with.Spring.Data.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class FlightBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "flight_id")
    private Integer flightId;

    public FlightBooking(Integer customerId, Integer flightId) {
        this.customerId = customerId;
        this.flightId = flightId;
    }

    public FlightBooking() {}

    public Integer getId() {
        return id;
    }
    public Integer getCustomerId() {
        return customerId;
    }
    public Integer getFlightId() {
        return flightId;
    }
}
