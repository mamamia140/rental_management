package com.gtu.rentalmanagement.service;

import com.gtu.rentalmanagement.entity.Bicycle;

import java.util.List;
import java.util.Optional;

public interface BicycleService {
    Optional<Bicycle> findById(Long id);

    Bicycle saveBicyle(Bicycle bicycle);

    List<Bicycle> findAllBicyles();
}
