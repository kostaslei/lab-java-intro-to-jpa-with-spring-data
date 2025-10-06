package com.example.LAB.Intro.to.JPA.with.Spring.Data.Controllers;

import com.example.LAB.Intro.to.JPA.with.Spring.Data.Models.Customer;
import com.example.LAB.Intro.to.JPA.with.Spring.Data.Models.CustomerStatus;
import com.example.LAB.Intro.to.JPA.with.Spring.Data.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    final private CustomerRepository customerRepository;

    @Autowired
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/status")
    public List<Customer> getCustomerByStatus(@RequestParam CustomerStatus status) {
        return customerRepository.findByStatus(status);
    }

    @GetMapping("/mileage")
    public List<Customer> getCustomerByMileageGreaterThan(@RequestParam(defaultValue = "10000") Integer mileage) {
        return customerRepository.findByMileageGreaterThan(mileage);
    }

}
