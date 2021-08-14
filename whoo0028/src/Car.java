import java.util.ArrayList;
import java.util.Random;

public class Car{
    private String maker;
    private String model;
    private ArrayList<Bid> bidHist=new ArrayList<Bid>();

    public Car() {}
    public Car(String maker, String model) {
        this.maker = maker;
        this.model = model;
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

    public String description(){
        return maker+model;
    }
    public void addBid(Buyer newBuyer,int price,String date){
        Random r = new Random();
        int low = 10000;
        int high = 99999;
        int id=r.nextInt(high-low)+low;
        bidHist.add(new Bid(id,newBuyer,price,date));
    }
    public ArrayList<Bid> getBidHist(){
        return bidHist;
    }
}