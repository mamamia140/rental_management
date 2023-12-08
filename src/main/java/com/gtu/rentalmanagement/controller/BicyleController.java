package com.gtu.rentalmanagement.controller;

import com.gtu.rentalmanagement.entity.Bicyle;
import com.gtu.rentalmanagement.entity.User;
import com.gtu.rentalmanagement.service.BicyleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bicyles")
public class BicyleController {

    private final BicyleService bicyleService;

    public BicyleController(BicyleService bicyleService){
        this.bicyleService = bicyleService;
    }

    @GetMapping
    public List<Bicyle> findAllBicyles(){
        return bicyleService.findAllBicyles();
    }

    @GetMapping("/{id}")
    public Optional<Bicyle> findById(@PathVariable("id") Long id){
        return bicyleService.findById(id);
    }

    @PostMapping
    public Bicyle saveBicyle(@RequestBody Bicyle bicyle){
        return bicyleService.saveBicyle(bicyle);
    }
}
