package com.codegym.dto.employee;

import com.codegym.model.Person;
import com.codegym.model.employee.Division;
import com.codegym.model.employee.EducationDegree;
import com.codegym.model.employee.Position;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Table (name = "nhan_vien")
public class EmployeeDto extends Person implements Validator {
    @Column (name = "luong")
    @Min(value = 0, message = "Luong phải lớn hon 0")
    private double salary;

    @ManyToOne
    @JoinColumn (name = "ma_vi_tri")
    private Position position;

    @ManyToOne
    @JoinColumn (name = "ma_trinh_do")
    private EducationDegree educationDegree;

    @ManyToOne
    @JoinColumn (name = "ma_bo_phan")
    private Division division;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public EmployeeDto() {
    }

    public EmployeeDto(Integer id, String name, String birthDay, String identityCard, String phoneNumber, String email, String address, double salary) {
        super(id, name, birthDay, identityCard, phoneNumber, email, address);
        this.salary = salary;

    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        EmployeeDto employeeDto = (EmployeeDto) target;
        if(!(employeeDto.getPhoneNumber().matches("^(090)[0-9]{7}$")||employeeDto.getPhoneNumber().matches("^(091)[0-9]{7}$"))){
            errors.rejectValue("phoneNumber", "phoneNumber.invalidFormat");
        }
        if(!(employeeDto.getIdentityCard().matches("[0-9]{9}")||employeeDto.getPhoneNumber().matches("[0-9]{12}"))){
            errors.rejectValue("identityCard", "identityCard.invalidFormat");
        }
        if (!employeeDto.getEmail().matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+.[A-Za-z0-9]+")){
            errors.rejectValue("email", "email.invalidFormat");
        }
    }
}
