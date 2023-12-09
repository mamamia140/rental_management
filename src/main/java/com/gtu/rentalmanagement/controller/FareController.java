package com.gtu.rentalmanagement.controller;

import com.gtu.rentalmanagement.entity.BicyleType;
import com.gtu.rentalmanagement.entity.Fare;
import com.gtu.rentalmanagement.entity.User;
import com.gtu.rentalmanagement.service.FareService;
import com.gtu.rentalmanagement.service.UserService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/fares")
public class FareController {


    private final FareService fareService;

    public FareController(FareService fareService){
        this.fareService = fareService;
    }

    @GetMapping
    public List<Fare> findAllFares(){
        return fareService.findAllFares();
    }

    @GetMapping("/{id}")
    public Optional<Fare> findById(@PathVariable("id") Long id){
        return fareService.findById(id);
    }

    @PostMapping
    public Fare saveFare(@RequestBody Fare fare){
        return fareService.saveFare(fare);
    }
}
