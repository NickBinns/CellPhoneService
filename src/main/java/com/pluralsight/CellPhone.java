package com.pluralsight;

public class CellPhone {
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;
    private Long serialNumber;
    public CellPhone () {
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
        this.serialNumber = 0L;


    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getOwner() {
        return owner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }
    public void dial(String phoneNumber) {
        System.out.println(this.owner + " is calling " + phoneNumber);
    }
}

