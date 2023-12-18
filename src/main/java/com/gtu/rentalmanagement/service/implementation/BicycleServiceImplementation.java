package com.gtu.rentalmanagement.service.implementation;

import com.gtu.rentalmanagement.entity.Bicycle;
import com.gtu.rentalmanagement.repository.BicycleRepository;
import com.gtu.rentalmanagement.service.BicycleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BicycleServiceImplementation implements BicycleService {
    private final BicycleRepository bicycleRepository;

    public BicycleServiceImplementation(BicycleRepository bicycleRepository) {
        this.bicycleRepository = bicycleRepository;
    }

    @Override
    public Optional<Bicycle> findById(Long id) {
        return bicycleRepository.findById(id);
    }

    @Override
    public Bicycle saveBicyle(Bicycle bicycle) {
        return bicycleRepository.save(bicycle);
    }

    @Override
    public List<Bicycle> findAllBicyles() {
        return bicycleRepository.findAll();
    }
}
