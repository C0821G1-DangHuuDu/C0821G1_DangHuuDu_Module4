package com.codegym.service.employee.imp;

import com.codegym.model.employee.Division;
import com.codegym.model.employee.EducationDegree;
import com.codegym.repository.employee.IEducationDegreeRepository;
import com.codegym.service.employee.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeService implements IEducationDegreeService {
    @Autowired
    private IEducationDegreeRepository educationDegreeRepository;


    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
