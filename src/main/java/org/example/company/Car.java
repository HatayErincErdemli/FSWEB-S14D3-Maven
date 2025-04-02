package org.example.company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Objects;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;

    }
    public String startEngine(){
        printSimpleName();
        return "the car's engine is starting";
    }

    private void printSimpleName() {
        System.out.println("Class name: "+ getClass().getSimpleName());
    }

    public String accelerate(){
        printSimpleName();
        return "the car is accelerating";
    }
    public String brake(){
        printSimpleName();
        return "the car is braking";
    }

    public String getName(){
        return name;
    }
    public int getCylinders(){
        return cylinders;
    }



    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }
}
