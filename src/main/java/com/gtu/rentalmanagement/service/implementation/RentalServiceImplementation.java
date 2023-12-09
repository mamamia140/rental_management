package com.gtu.rentalmanagement.service.implementation;

import com.gtu.rentalmanagement.entity.Rental;
import com.gtu.rentalmanagement.repository.RentalRepository;
import com.gtu.rentalmanagement.service.RentalService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RentalServiceImplementation implements RentalService {

    private final RentalRepository rentalRepository;

    public RentalServiceImplementation(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }


    @Override
    public Optional<Rental> findById(Long id) {
        return rentalRepository.findById(id);
    }

    @Override
    public Rental saveRental(Rental rental) {
        return rentalRepository.save(rental);
    }

    @Override
    public List<Rental> findAllRentals() {
        return rentalRepository.findAll();
    }
}
