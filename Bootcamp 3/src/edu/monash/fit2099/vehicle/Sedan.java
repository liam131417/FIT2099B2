package edu.monash.fit2099.vehicle;

public class Sedan extends Vehicle {
    int seats;

    public Sedan(String maker, String model, int seats) {
        super(maker, model);
        this.seats = seats;
    }

    public Sedan(String maker, String model, int vId, int seats) {
        super(maker, model, vId);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

}
