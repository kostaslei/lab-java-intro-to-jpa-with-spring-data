package com.example.LAB.Intro.to.JPA.with.Spring.Data.Controllers;

import com.example.LAB.Intro.to.JPA.with.Spring.Data.Models.FlightBooking;
import com.example.LAB.Intro.to.JPA.with.Spring.Data.Repositories.CustomerRepository;
import com.example.LAB.Intro.to.JPA.with.Spring.Data.Repositories.FlightBookingRepository;
import com.example.LAB.Intro.to.JPA.with.Spring.Data.Repositories.FlightRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class FlightBookingController {

    final private FlightBookingRepository flightBookingRepository;

    public FlightBookingController(FlightBookingRepository flightBookingRepository) {
        this.flightBookingRepository = flightBookingRepository;
    }

    @GetMapping("/customer/{id}")
    public List<FlightBooking> findByCustomerId(@PathVariable Integer id) {
        return flightBookingRepository.findByCustomerId(id);
    }
    @GetMapping("/customer/flight/{id}")
    public List<FlightBooking> findByFlightId(@PathVariable Integer id) {
        return flightBookingRepository.findByFlightId(id);
    }
}
