package org.example.day3;

import javax.swing.table.TableRowSorter;

public class Car {
    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;


    int numberOfPeopleInCar = 1;
    int maxOfNumberPeopleInCar = 6;

    public Car(){}

    public Car (int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public int getMinSpeed(){
        return this.minSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed){
        this.maxSpeed = newMaxSpeed;
    }

    public double getWeight(){
        return this.weight;
    }

    public boolean getIsTheCarOn(){
        return this.isTheCarOn;
    }

    public void printVariables(){
        System.out.println("This is the MaxSpeed : " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void upgradeMaxSpeed(){
        setMaxSpeed(getMaxSpeed() + 10);
    }

    public void getIn(){
        if (numberOfPeopleInCar < maxOfNumberPeopleInCar) {
            numberOfPeopleInCar++;
            System.out.println("Someone Got In");
        } else {
            System.out.println("The Car is Full! " + numberOfPeopleInCar + " = " + maxOfNumberPeopleInCar);
        }
    }

    public void getOut(){
        if (numberOfPeopleInCar > 0) {
            numberOfPeopleInCar--;
        }else {
            System.out.println("No one is in the car, " + numberOfPeopleInCar + " people");
        }
    }

    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }

    public void turnTheCarOn(){
        // if the car isn't on...
        if (!isTheCarOn){
            // turn it on
            isTheCarOn = true;
        }else {
            // otherwise print out the fact it's on
            System.out.println("The car is already on " + isTheCarOn);
        }
    }

//    public static void main(String[] args) {
//        Car tommyCar = new Car();
//        tommyCar.getOut();
//        tommyCar.getOut();
//        tommyCar.getIn();
//        tommyCar.getIn();
//        tommyCar.getIn();
//        tommyCar.getIn();
//        tommyCar.getIn();
//        tommyCar.getIn();
//        tommyCar.getIn();
//        tommyCar.turnTheCarOn();
//        tommyCar.turnTheCarOn();
//
//    }
}
