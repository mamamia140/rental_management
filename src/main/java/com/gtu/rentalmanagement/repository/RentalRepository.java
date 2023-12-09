package com.gtu.rentalmanagement.repository;

import com.gtu.rentalmanagement.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental,Long> {
}
