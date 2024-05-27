package com.springboot.accountcustomerAPI.repository;

import com.springboot.accountcustomerAPI.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountCustomerRepository  extends JpaRepository<Employee, Long> {
    void deleteCustomerById(Long id);

    AccountCustomer getCustomerById(Long id);
}
