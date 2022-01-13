package com.codegym.model.employee;

import com.codegym.model.Person;

import javax.persistence.*;

@Entity
@Table (name = "nhan_vien")
public class Employee extends Person {
    @Column (name = "luong")
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

    public Employee() {
    }

    public Employee(Integer id, String name, String birthDay, String identityCard, String phoneNumber, String email, String address, double salary) {
        super(id, name, birthDay, identityCard, phoneNumber, email, address);
        this.salary = salary;

    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
