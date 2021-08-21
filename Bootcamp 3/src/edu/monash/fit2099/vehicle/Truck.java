package edu.monash.fit2099.vehicle;

public class Truck extends Vehicle{
    double capacity;
    int wheels;

    public Truck(String maker, String model, double capacity, int wheels) {
        super(maker, model);
        this.capacity = capacity;
        this.wheels = wheels;
    }

    public Truck(String maker, String model, int vId, double capacity, int wheels) {
        super(maker, model, vId);
        this.capacity = capacity;
        this.wheels = wheels;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

}
