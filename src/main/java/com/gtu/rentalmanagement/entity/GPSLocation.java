package com.gtu.rentalmanagement.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class GPSLocation {

    private double latitude;
    private double longitude;

    public GPSLocation(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public GPSLocation() {

    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
