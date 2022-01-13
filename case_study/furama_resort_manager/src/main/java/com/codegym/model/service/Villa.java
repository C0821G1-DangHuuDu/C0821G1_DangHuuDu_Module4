package com.codegym.model.service;

import com.codegym.model.Service;

import javax.persistence.Entity;

@Entity
public class Villa extends Service {
    private String standardRoom;
    private double poolArea;
    private int numberOfFloor;
    private String otherDescription;

    public Villa() {
    }

    public Villa(Integer serviceId, String serviceName, double usableArea, double rentPrice, int maxOfPeople, String typeOfRent, String standardRoom, double poolArea, int numberOfFloor, String otherDescription) {
        super(serviceId, serviceName, usableArea, rentPrice, maxOfPeople, typeOfRent);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
        this.otherDescription = otherDescription;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
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
