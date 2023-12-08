package com.gtu.rentalmanagement.repository;

import com.gtu.rentalmanagement.entity.Bicyle;
import com.gtu.rentalmanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BicyleRepository extends JpaRepository<Bicyle,Long> {
}
