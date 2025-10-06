package com.example.LAB.Intro.to.JPA.with.Spring.Data.Models;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum CustomerStatus {
    GOLD,
    SILVER,
    NONE;

    @JsonCreator
    public static CustomerStatus fromValue(String value) {
        return CustomerStatus.valueOf(value.toUpperCase());
    }
}