package com.codegym.service.employee.imp;

import com.codegym.dto.employee.EmployeeDto;
import com.codegym.model.employee.Employee;
import com.codegym.repository.employee.IEmployeeRepository;
import com.codegym.service.employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    @Override
    public Page<Employee> findAll(PageRequest of) {
        return employeeRepository.findAll(of);
    }

    @Override
    public void save(EmployeeDto employeeDto) {
        Employee employee = new Employee(employeeDto.getId(),employeeDto.getName(),employeeDto.getBirthDay(),employeeDto.getIdentityCard(),employeeDto.getPhoneNumber(),employeeDto.getEmail(),employeeDto.getAddress(),employeeDto.getSalary());
        employee.setDivision(employeeDto.getDivision());
        employee.setPosition(employeeDto.getPosition());
        employee.setEducationDegree(employeeDto.getEducationDegree());
        employeeRepository.save(employee);
    }

    @Override
    public Page<Employee> findByName(Pageable pageable, String name) {
        Page<Employee> employeeList = employeeRepository.findByName(pageable,"%"+name+"%");
        return employeeList;
    }

    @Override
    public Employee findById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        employeeRepository.deleteById(id);
    }
}
