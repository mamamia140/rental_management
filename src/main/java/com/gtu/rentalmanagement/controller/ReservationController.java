package com.gtu.rentalmanagement.controller;

import com.gtu.rentalmanagement.entity.Reservation;
import com.gtu.rentalmanagement.entity.User;
import com.gtu.rentalmanagement.service.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static java.lang.Long.parseLong;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private final ReservationService reservationService;


    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public List<Reservation> findAllReservations(){
        return reservationService.findAllReservations();
    }

    @GetMapping("/{id}")
    public Optional<Reservation> findById(@PathVariable("id") Long id){
        return reservationService.findById(id);
    }

    @PostMapping
    public Reservation saveReservation(@RequestBody Reservation reservation){
        return reservationService.saveReservation(reservation);
    }

    @RequestMapping(value="reservations", method = RequestMethod.GET)
    public @ResponseBody Optional<Reservation> getUser(@RequestParam("id") String reservationId){
        return reservationService.findById(parseLong(reservationId));
    }
}
