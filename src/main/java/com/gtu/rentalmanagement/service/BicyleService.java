package com.gtu.rentalmanagement.service;

import com.gtu.rentalmanagement.entity.Bicyle;

import java.util.List;
import java.util.Optional;

public interface BicyleService {
    Optional<Bicyle> findById(Long id);

    Bicyle saveBicyle(Bicyle bicyle);

    List<Bicyle> findAllBicyles();
}
