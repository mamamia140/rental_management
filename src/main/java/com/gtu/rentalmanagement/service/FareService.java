package com.gtu.rentalmanagement.service;

import com.gtu.rentalmanagement.entity.BicyleType;
import com.gtu.rentalmanagement.entity.Fare;
import com.gtu.rentalmanagement.entity.User;

import java.util.List;
import java.util.Optional;

public interface FareService {

    Optional<Fare> findById(Long id);

    Fare saveFare(Fare fare);

    List<Fare> findAllFares();
}
