package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column (name = "name")
    private String name;
    @Column (name = "day_of_birth")
    private String dayOfBirth;
    @Column (name = "phone_number")
    private String phoneNumber;

    public Customer() {}

    public Customer(Long id, String name, String dayOfBirth, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
