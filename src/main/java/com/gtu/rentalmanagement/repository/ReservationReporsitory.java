package com.gtu.rentalmanagement.repository;

import com.gtu.rentalmanagement.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationReporsitory extends JpaRepository<Reservation,Long> {
}
