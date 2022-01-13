package com.codegym.model.service;

import com.codegym.model.Service;

import javax.persistence.Entity;

@Entity
public class House extends Service {
    private String standardRoom;
    private int numberOfFloor;
    private String otherDescription;

    public House() {
    }

    public House(Integer serviceId, String serviceName, double usableArea, double rentPrice, int maxOfPeople, String typeOfRent, String standardRoom, int numberOfFloor, String otherDescription) {
        super(serviceId, serviceName, usableArea, rentPrice, maxOfPeople, typeOfRent);
        this.standardRoom = standardRoom;
        this.numberOfFloor = numberOfFloor;
        this.otherDescription = otherDescription;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }
}
