package com.gtu.rentalmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "fare")
public class Fare {

    @Id
    @JoinColumn(name = "type")
    private BicyleType type;

    private double openingFare;

    private double minutesFare;

    public Fare(BicyleType type, double openingFare, double minutesFare){
        this.type = type;
        this.openingFare = openingFare;
        this.minutesFare = minutesFare;
    }


    public Fare() {

    }
}
