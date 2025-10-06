package com.example.LAB.Intro.to.JPA.with.Spring.Data.Repositories;

import com.example.LAB.Intro.to.JPA.with.Spring.Data.Models.Customer;
import com.example.LAB.Intro.to.JPA.with.Spring.Data.Models.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    List<Customer> findByStatus(CustomerStatus status);
    List<Customer> findByMileageGreaterThan(Integer mileage);

}
