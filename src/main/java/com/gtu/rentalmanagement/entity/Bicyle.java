package com.gtu.rentalmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bicyles")
public class Bicyle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private GPSLocation location;

    @Column
    private double batteryPercentage;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Fare fare;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public GPSLocation getLocation() {
        return location;
    }

    public void setLocation(GPSLocation location) {
        this.location = location;
    }

    public double getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(double batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
}
