package com.codegym.service.customer;

import com.codegym.model.customer.Customer;
import com.codegym.model.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerService {
    Page<Customer> findAll(PageRequest of);
}
