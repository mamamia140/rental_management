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

    @Column(name = "type")
    private BicyleType type;

    @Column
    private double batteryPercentage;
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

    public BicyleType getType() {
        return type;
    }

    public void setType(BicyleType type) {
        this.type = type;
    }

    public double getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(double batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
}
