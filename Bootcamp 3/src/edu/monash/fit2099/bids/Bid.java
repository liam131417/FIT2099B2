package edu.monash.fit2099.bids;

import edu.monash.fit2099.buyers.Buyer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Bid {
    private int bidID;
    private double bidPrice;
    private String bidDate;
    int buyerID;

    public Bid(double bidPrice,String bidDate,int buyerID){
        bidID=nextID();
        this.bidPrice=bidPrice;
        this.bidDate=bidDate;
        this.buyerID=buyerID;
    }

    public int getBidID() {
        return bidID;
    }

    public void setBidID(int bidID) {
        this.bidID = bidID;
    }

    public double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public String getBidDate() {
        return bidDate;
    }

    public void setBidDate(String bidDate) {
        this.bidDate = bidDate;
    }

    public int nextID() {
        Random r = new Random();
        int low = 10000;
        int high = 99999;
        return (r.nextInt(high - low) + low);
    }


}
