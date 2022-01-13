package com.codegym.service.employee;

import com.codegym.dto.employee.EmployeeDto;
import com.codegym.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEmployeeService {
    List<Employee> findAll();

    Page<Employee> findAll(PageRequest of);

    void save(EmployeeDto employeeDto);

    Page<Employee> findByName(Pageable pageable, String name);

    Employee findById(Integer id);

    void deleteById(Integer id);
}
