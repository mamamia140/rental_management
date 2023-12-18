package com.gtu.rentalmanagement.controller;

import com.gtu.rentalmanagement.entity.Bicycle;
import com.gtu.rentalmanagement.service.BicycleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bicycles")
public class BicycleController {

    private final BicycleService bicycleService;

    public BicycleController(BicycleService bicycleService){
        this.bicycleService = bicycleService;
    }

    @GetMapping
    public List<Bicycle> findAllBicyles(){
        return bicycleService.findAllBicyles();
    }

    @GetMapping("/{id}")
    public Optional<Bicycle> findById(@PathVariable("id") Long id){
        return bicycleService.findById(id);
    }

    @PostMapping
    public Bicycle saveBicyle(@RequestBody Bicycle bicycle){
        return bicycleService.saveBicyle(bicycle);
    }
}
