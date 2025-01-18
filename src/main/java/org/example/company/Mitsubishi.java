package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getName() + " engine is starting";

    }

    @Override
    public String accelerate() {
        return getName() + " is accelerating";
    }

    @Override
    public String brake() {
        return getName()+ " the car is braking.";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
