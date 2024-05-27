package com.springboot.accountcustomerAPI.service;

import com.springboot.accountcustomerAPI.exception.UserNotFoundException;
import com.springboot.accountcustomerAPI.model.Employee;
import com.springboot.accountcustomerAPI.repository.AccountCustomerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AccountCustomerService {
    private final AccountCustomerRepository accountCustomerRepository;

    public AccountCustomerService(AccountCustomerRepository accountCustomerRepository) {
        this.accountCustomerRepository = accountCustomerRepository;
    }

    public AccountCustomer addCustomer(AccountCustomer customer){

        return accountCustomerRepository.save(customer);
    }

    public List<AccountCustomer> findAllCustomers(){
        return accountCustomerRepository.findAll();
    }
    public AccountCustomer updateCustomer(AccountCustomer customer){
        return accountCustomerRepository.save(customer);

    }
    public AccountCustomer getCustomerById(Long id){
        return accountCustomerRepository.getCustomerById(id);

    }
    public  void deleteCustomer(Long id){
        accountCustomerRepository.deleteCustomerById(id);
    }
}
