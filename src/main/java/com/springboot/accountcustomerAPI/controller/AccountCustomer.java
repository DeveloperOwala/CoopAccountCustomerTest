package com.springboot.accountcustomerAPI.controller;

import com.springboot.accountcustomerAPI.model.Employee;
import com.springboot.accountcustomerAPI.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AccountCustomerController {
 private final AccountCustomerService employeeService;
s
    public AccountCustomerController(AccountCustomerService accountCustomerService) {
        this.accountCustomerService = accountCustomerService;
    }
    @GetMapping("/all")
    //get add customers
    public ResponseEntity<List<AccountCustomer>> getAllCustomers(){
        List<AccountCustomer> accountCustomer = accountCustomerService.findAllCustomers();

        return new ResponseEntity<>(accountCustomer, HttpStatus.OK);
    }
    // get customer by id rest API
    @GetMapping("/{id}")
    public ResponseEntity<AccountCustomer> getCustomerById(@PathVariable("id") Long id){
        AccountCustomer accountCustomer = accountCustomerService.getCustomerById(id);

        return new ResponseEntity<>(accountCustomer, HttpStatus.OK);
    }
     //add customer
    @PostMapping("/add")
    public ResponseEntity<AccountCustomer> addCustomer(@RequestBody AccountCustomer customer){
        AccountCustomer newCustomer = AccountCustomereeService.addCustomer(customer);
        return  new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }
    //update customer
    @PutMapping("/update")
    public ResponseEntity<AccountCustomer> updateCustomer(@RequestBody AccountCustomer customer){
        Employee updateCustomer = AccountCustomerService.updateCustomer(customer);
        return  new ResponseEntity<>(updateCustomer, HttpStatus.OK);
    }
    //delete customer by id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCustomerById(@PathVariable("id") Long id){
       employeeService.deleteAccountCustomer(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }


//    @Autowired
//    private EmployeeService employeeService;
//
//    // get all employees
//
//    @GetMapping("/all")
//    public List<Employee> getAllEmployees(){
//        return employeeRepository.findAll();
//    }
//
//    // create employee rest API
//    @PostMapping("/employees")
//    public Employee createEmployee( @RequestBody Employee employee){
//        return employeeRepository.save(employee);
//    }

}
