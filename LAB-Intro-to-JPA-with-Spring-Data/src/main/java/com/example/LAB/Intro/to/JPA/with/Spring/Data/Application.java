package com.example.LAB.Intro.to.JPA.with.Spring.Data;

import com.example.LAB.Intro.to.JPA.with.Spring.Data.Models.Customer;
import com.example.LAB.Intro.to.JPA.with.Spring.Data.Models.CustomerStatus;
import com.example.LAB.Intro.to.JPA.with.Spring.Data.Models.Flight;
import com.example.LAB.Intro.to.JPA.with.Spring.Data.Models.FlightBooking;
import com.example.LAB.Intro.to.JPA.with.Spring.Data.Repositories.CustomerRepository;
import com.example.LAB.Intro.to.JPA.with.Spring.Data.Repositories.FlightBookingRepository;
import com.example.LAB.Intro.to.JPA.with.Spring.Data.Repositories.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


    @Bean
    CommandLineRunner run(CustomerRepository customerRepo,
                          FlightRepository flightRepo,
                          FlightBookingRepository bookingRepo) {
        return args -> {
            Customer alice = customerRepo.save(new Customer("Alice", "Wonderland", CustomerStatus.GOLD, 120000));
            Flight flight = flightRepo.save(new Flight("AB123", "Boeing 747", 300, 400));
            bookingRepo.save(new FlightBooking(alice.getId(), flight.getId()));

            Customer bob = customerRepo.save(new Customer("Bob", "Marley", CustomerStatus.SILVER, 85000));
            Flight flight2 = flightRepo.save(new Flight("CD456", "Airbus A330", 250, 3200));
            bookingRepo.save(new FlightBooking(bob.getId(), flight2.getId()));

            Customer clara = customerRepo.save(new Customer("Clara", "Oswald", CustomerStatus.NONE, 5000));
            Flight flight3 = flightRepo.save(new Flight("EF789", "Boeing 777", 280, 1750));
            bookingRepo.save(new FlightBooking(clara.getId(), flight3.getId()));

            Customer david = customerRepo.save(new Customer("David", "Tennant", CustomerStatus.GOLD, 210000));
            Flight flight4 = flightRepo.save(new Flight("GH012", "Airbus A350", 300, 4200));
            bookingRepo.save(new FlightBooking(david.getId(), flight4.getId()));

            Customer emma = customerRepo.save(new Customer("Emma", "Stone", CustomerStatus.SILVER, 98000));
            Flight flight5 = flightRepo.save(new Flight("IJ345", "Boeing 737", 180, 1500));
            bookingRepo.save(new FlightBooking(emma.getId(), flight5.getId()));
        };
    }
}
