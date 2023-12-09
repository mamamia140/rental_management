package com.gtu.rentalmanagement.service;

import com.gtu.rentalmanagement.entity.Rental;

import java.util.List;
import java.util.Optional;

public interface RentalService {
    Optional<Rental> findById(Long id);

    Rental saveRental(Rental rental);

    List<Rental> findAllRentals();
}
