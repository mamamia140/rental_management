package com.gtu.rentalmanagement.controller;

import com.gtu.rentalmanagement.entity.Rental;
import com.gtu.rentalmanagement.entity.User;
import com.gtu.rentalmanagement.service.RentalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static java.lang.Long.parseLong;

@RestController
@RequestMapping("/rentals")
public class RentalController {

    private final RentalService rentalService;


    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping
    public List<Rental> findAllRentals(){
        return rentalService.findAllRentals();
    }

    @GetMapping("/{id}")
    public Optional<Rental> findById(@PathVariable("id") Long id){
        return rentalService.findById(id);
    }

    @PostMapping
    public Rental saveRental(@RequestBody Rental rental){
        return rentalService.saveRental(rental);
    }

    @RequestMapping(value="users", method = RequestMethod.GET)
    public @ResponseBody Optional<Rental> getRental(@RequestParam("id") String rentalId){
        return rentalService.findById(parseLong(rentalId));
    }
}
