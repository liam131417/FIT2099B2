package edu.monash.fit2099.vehicle;

import edu.monash.fit2099.bids.BidsManager;

import java.util.Random;

abstract public class Vehicle {
    private String maker;
    private String model;
    private int vId;
    private BidsManager bidsManager;

    public Vehicle(String maker, String model){
        bidsManager=new BidsManager();
        this.maker=maker;
        this.model=model;
        vId=nextID();
    }

    public Vehicle(String maker, String model, int vId) {
        bidsManager=new BidsManager();
        this.maker = maker;
        this.model = model;
        this.vId = vId;
    }


    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getvId() {
        return vId;
    }

    public void setvId(int vId) {
        this.vId = vId;
    }


    public BidsManager getBidsManager() {
        return bidsManager;
    }

    public int nextID() {
        Random r = new Random();
        int low = 10000;//using literal values is not a good idea, replace them with input parameters
        int high = 99999;
        return (r.nextInt(high - low) + low);
    }

}
