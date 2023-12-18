package com.gtu.rentalmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "fares")
public class Fare {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double openingFare;

    private double perMinuteFare;

    public Fare(double openingFare, double perMinuteFare){
        this.openingFare = openingFare;
        this.perMinuteFare = perMinuteFare;
    }


    public Fare() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getOpeningFare() {
        return openingFare;
    }

    public void setOpeningFare(double openingFare) {
        this.openingFare = openingFare;
    }

    public double getPerMinuteFare() {
        return perMinuteFare;
    }

    public void setPerMinuteFare(double perMinuteFare) {
        this.perMinuteFare = perMinuteFare;
    }
}
