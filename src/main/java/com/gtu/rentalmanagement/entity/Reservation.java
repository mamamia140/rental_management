package com.gtu.rentalmanagement.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Bicycle bicycle;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private User user;

    @Column
    private Date start;
    @Column
    @Enumerated(EnumType.STRING)
    private ReservationStatus reservationStatus;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Bicycle getBicyle() {
        return bicycle;
    }

    public void setBicyle(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
}
