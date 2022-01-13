package com.codegym.model.employee;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "vi_tri")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer positionId;
    @Column (name = "ten_vi_tri")
    private String positionName;

    public Position() {
    }

    public Position(Integer positionId, String positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }

    @OneToMany(mappedBy = "position")
    private Set<Employee> employees;

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
