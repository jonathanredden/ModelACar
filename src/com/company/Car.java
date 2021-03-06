package com.company;

import java.util.Scanner;

public class Car {
    private String make;
    private String carType;
    private String model;
    private String gasType;
    private String tireType;
    private boolean gas;
    private boolean engineOn;

    private int fuelCapacity;
    private int wheels;
    private int acceleration;
    private int speed;
    private int year;
    private int seats;
    private int doors;
    private int axle;

    Scanner  input = new Scanner(System.in);


    public Car() {

        this.make = make;
        System.out.println("What is the make of your car?");
        setModel(input.nextLine());
        this.carType = carType;
        System.out.println("what is your car type?");
        setCarType(input.nextLine());
        this.model = model;
        System.out.println("What is your car model?");
        setModel(input.nextLine());
        this.gasType = gasType;
        System.out.println("Diesel or Unleaded?");
        setGasType(input.nextLine());
        this.tireType = tireType;
        this.gas = gas;
        this.engineOn = engineOn;
        this.fuelCapacity = fuelCapacity;
        this.wheels = wheels;
        this.acceleration = acceleration;
        this.speed = speed;
        this.year = year;
        this.seats = seats;
        this.doors = doors;
        this.axle = axle;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGasType() {
        return gasType;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public boolean isGas() {
        return gas;
    }

    public void setGas(boolean gas) {
        this.gas = gas;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getAxle() {
        return axle;
    }

    public void setAxle(int axle) {
        this.axle = axle;
    }
}
