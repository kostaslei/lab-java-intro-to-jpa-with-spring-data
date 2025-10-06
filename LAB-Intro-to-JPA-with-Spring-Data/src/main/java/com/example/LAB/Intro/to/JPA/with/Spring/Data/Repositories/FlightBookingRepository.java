package com.example.LAB.Intro.to.JPA.with.Spring.Data.Repositories;

import com.example.LAB.Intro.to.JPA.with.Spring.Data.Models.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBooking,Integer> {
    public List<FlightBooking> findByCustomerId(Integer customerId);
    public List<FlightBooking> findByFlightId(Integer flightId);
}
