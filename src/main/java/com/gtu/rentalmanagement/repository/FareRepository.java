package com.gtu.rentalmanagement.repository;

import com.gtu.rentalmanagement.entity.BicyleType;
import com.gtu.rentalmanagement.entity.Fare;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FareRepository  extends JpaRepository<Fare, Long> {
}
