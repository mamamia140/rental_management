package com.gtu.rentalmanagement.service.implementation;

import com.gtu.rentalmanagement.entity.Fare;
import com.gtu.rentalmanagement.repository.FareRepository;
import com.gtu.rentalmanagement.service.FareService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FareServiceImplementation implements FareService {
    private final FareRepository fareRepository;

    public FareServiceImplementation(FareRepository fareRepository) {
        this.fareRepository = fareRepository;
    }

    @Override
    public Optional<Fare> findById(Long id) {
        return fareRepository.findById(id);
    }

    @Override
    public Fare saveFare(Fare fare) {
        return fareRepository.save(fare);
    }

    @Override
    public List<Fare> findAllFares() {
        return fareRepository.findAll();
    }
}
