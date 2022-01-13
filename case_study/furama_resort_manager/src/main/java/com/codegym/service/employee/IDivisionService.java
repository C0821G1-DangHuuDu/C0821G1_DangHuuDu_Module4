package com.codegym.service.employee;

import com.codegym.model.employee.Division;
import com.codegym.model.employee.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IDivisionService {
    List<Division> findAll();
}
