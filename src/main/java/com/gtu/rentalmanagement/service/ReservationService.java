package com.gtu.rentalmanagement.service;

import com.gtu.rentalmanagement.entity.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationService {

    Optional<Reservation> findById(Long id);

    Reservation saveReservation(Reservation reservation);

    List<Reservation> findAllReservations();
}

