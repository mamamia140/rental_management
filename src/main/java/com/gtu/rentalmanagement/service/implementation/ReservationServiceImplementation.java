package com.gtu.rentalmanagement.service.implementation;

import com.gtu.rentalmanagement.entity.Reservation;
import com.gtu.rentalmanagement.repository.ReservationReporsitory;
import com.gtu.rentalmanagement.service.ReservationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImplementation implements ReservationService {

    private final ReservationReporsitory reservationReporsitory;

    public ReservationServiceImplementation(ReservationReporsitory reservationReporsitory) {
        this.reservationReporsitory = reservationReporsitory;
    }

    @Override
    public Optional<Reservation> findById(Long id) {
        return reservationReporsitory.findById(id);
    }

    @Override
    public Reservation saveReservation(Reservation reservation) {
        return reservationReporsitory.save(reservation);
    }

    @Override
    public List<Reservation> findAllReservations() {
        return reservationReporsitory.findAll();
    }
}
