package com.gtu.rentalmanagement.service.implementation;

import com.gtu.rentalmanagement.entity.Bicyle;
import com.gtu.rentalmanagement.repository.BicyleRepository;
import com.gtu.rentalmanagement.repository.UserRepository;
import com.gtu.rentalmanagement.service.BicyleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BicyleServiceImplementation implements BicyleService {
    private final BicyleRepository bicyleRepository;

    public BicyleServiceImplementation(BicyleRepository bicyleRepository) {
        this.bicyleRepository = bicyleRepository;
    }

    @Override
    public Optional<Bicyle> findById(Long id) {
        return bicyleRepository.findById(id);
    }

    @Override
    public Bicyle saveBicyle(Bicyle bicyle) {
        return bicyleRepository.save(bicyle);
    }

    @Override
    public List<Bicyle> findAllBicyles() {
        return bicyleRepository.findAll();
    }
}
