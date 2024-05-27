package com.springboot.accountcustomerAPI.repository;

import com.springboot.accountcustomerAPI.model.AccountCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountCustomerRepository  extends JpaRepository<AccountCustomer, Long> {
    void deleteCustomerById(Long id);

    AccountCustomer getCustomerById(Long id);
}
