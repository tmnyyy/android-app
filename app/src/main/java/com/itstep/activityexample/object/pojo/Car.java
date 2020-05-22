package com.itstep.activityexample.object.pojo;


public class Car {

    private String model;
    private int maxSpeed;
    private double engineValue;

    public Car(String model, int maxSpeed, double engineValue) {
        this.engineValue = engineValue;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getEngineValue() {
        return engineValue;
    }

    public void setEngineValue(double engineValue) {
        this.engineValue = engineValue;
    }

}
