package com.codegym.model;

import javax.persistence.*;

@Entity
@Table (name = "hop_dong")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String contractId;
    private String startDate;
    private String endDate;
    private double contractDeposit;
    private double totalMoney;
    //    Phải tạo model cho từng thuộc tính
    private String employeeId;
    //    Phải tạo model cho từng thuộc tính
    private String customerId;
    //    Phải tạo model cho từng thuộc tính
    private String serviceId;

    public Contract() {
    }

    public Contract(String contractId, String startDate, String endDate, double contractDeposit, double totalMoney, String employeeId, String customerId, String serviceId) {
        this.contractId = contractId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.contractDeposit = contractDeposit;
        this.totalMoney = totalMoney;
        this.employeeId = employeeId;
        this.customerId = customerId;
        this.serviceId = serviceId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(double contractDeposit) {
        this.contractDeposit = contractDeposit;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
}
