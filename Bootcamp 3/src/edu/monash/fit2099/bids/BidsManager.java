package edu.monash.fit2099.bids;

import edu.monash.fit2099.AutoShowroom;
import edu.monash.fit2099.buyers.Buyer;

import java.util.HashMap;
import java.util.Random;

public class BidsManager {
    HashMap<Integer,Bid> bidHashMap;
    public BidsManager() {
        bidHashMap= new HashMap<Integer,Bid>();
    }
    public void addBid(int buyerID, double bidPrice, String bidDate){
        Bid bid=new Bid(bidPrice,bidDate, buyerID);
        bidHashMap.put(buyerID,bid);
    }

    public HashMap<Integer, Bid> bidHash(){
        return bidHashMap;
    }

}
