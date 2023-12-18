package com.gtu.rentalmanagement.repository;

import com.gtu.rentalmanagement.entity.Bicycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BicycleRepository extends JpaRepository<Bicycle,Long> {
}
