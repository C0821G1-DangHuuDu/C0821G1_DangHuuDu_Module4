package com.codegym.service.employee;

import com.codegym.model.employee.Division;
import com.codegym.model.employee.EducationDegree;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEducationDegreeService{
    List<EducationDegree> findAll();
}
