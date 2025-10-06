package com.example.LAB.Intro.to.JPA.with.Spring.Data.Repositories;

import com.example.LAB.Intro.to.JPA.with.Spring.Data.Models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Integer> {
}
