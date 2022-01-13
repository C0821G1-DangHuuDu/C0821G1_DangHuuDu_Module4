package com.codegym.model.customer;

import com.codegym.model.Person;
import com.codegym.model.employee.Position;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "khach_hang")
public class Customer extends Person {

    private int gender;

    @ManyToOne
    @JoinColumn(name = "ma_loai_khach")
    private CustomerType customerType;

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Customer() {
    }

    public Customer(Integer id, String name, String birthDay, String identityCard, String phoneNumber, String email, String address, int gender) {
        super(id, name, birthDay, identityCard, phoneNumber, email, address);

        this.gender = gender;
    }


    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
