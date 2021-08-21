package edu.monash.fit2099;

import edu.monash.fit2099.bids.Bid;
import edu.monash.fit2099.buyers.Buyer;
import edu.monash.fit2099.vehicle.Sedan;
import edu.monash.fit2099.vehicle.Truck;
import edu.monash.fit2099.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class AutoShowroom {
    ArrayList<Vehicle> vehicles;
    HashMap<Integer,Buyer> buyerHashMap;
    Scanner scan =new Scanner(System.in);



    public void MainMenu(){
        int choice=0;
        vehicles = new ArrayList<Vehicle>();
        buyerHashMap= new HashMap<Integer, Buyer>();
        do {
            choice = selectedMenuItem();
            switch(choice) {
                case 1: {
                    createSedan();
                    break;
                }
                case 2:{
                    createTruck();
                    break;
                }

                case 3:{
                    displayFleet();
                    break;
                }
                case 4:{
                    createBuyer();
                    break;
                }
                case 5:{
                    displayBuyer();
                    break;
                }
                case 6:{
                    createBid();
                }
            }

        }while(choice!=7);
    }

    public int selectedMenuItem(){
        int choice=0;
        System.out.println(" +------------------------------+ ");
        System.out.println("            Bootcamp 4            ");
        System.out.println(" +------------------------------+ ");
        System.out.println(" 1. Add Sedan ");
        System.out.println(" 2. Add Truck ");
        System.out.println(" 3. Display Fleet ");
        System.out.println(" 4. Add Buyer ");
        System.out.println(" 5. List Buyer ");
        System.out.println(" 6. Add Bid ");
        System.out.println(" 7. Exit ");
        System.out.println(" Please Enter the respective number to select ");
        choice = scan.nextInt();
        scan.nextLine();
        return choice;
    }


    public void createSedan(){
        System.out.println("Maker : ");
        String maker = scan.nextLine();
        System.out.println("Model :");
        String model=scan.nextLine();
        System.out.println("Seats : ");
        int seat = scan.nextInt();
        scan.nextLine();
        vehicles.add(new Sedan(maker, model, seat));
    }

    public void createTruck(){
        System.out.println("Maker : ");
        String maker = scan.nextLine();
        System.out.println("Model : ");
        String model=scan.nextLine();
        System.out.println("Capacity : ");
        double capacity = scan.nextDouble();
        scan.nextLine();
        System.out.println("Wheels : ");
        int wheels= scan.nextInt();
        scan.nextLine();
        vehicles.add(new Truck(maker,model,capacity,wheels));
    }
    public void createBuyer(){
        System.out.println("Given Name :");
        String givenName = scan.nextLine();
        System.out.println("Family Name");
        String familyName = scan.nextLine();
        int id =nextID();
        buyerHashMap.put(id, new Buyer(id, givenName, familyName));
        System.out.println(String.format(" | %10s | %15s | %15s | ","Buyer ID","Buyer Given Name","Buyer Family Name"));
        System.out.println(String.format(" | %10d | %15s | %15s | " ,id, givenName, familyName));

    }

    public void displayFleet(){
        for( int i =0; i < vehicles.size();i++) {

            int vID = vehicles.get(i).getvId();
            System.out.print("Vehicle ID : " + Integer.toString(vID));

            String maker = vehicles.get(i).getMaker();
            System.out.print(" Maker : " + maker);

            String model = vehicles.get(i).getModel();
            System.out.print(" Model : " + model);
            System.out.println();
            int bidID = 0;
            double bidPrice = 0;
            String bidDate = "";
            try{
                HashMap<Integer, Bid> bidMap = vehicles.get(i).getBidsManager().bidHash();
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println(String.format(" | %10s | %10s | %10s | %15s | ", "Buyer ID", "Bid ID", "Bid Price", "Bid Date"));
                for (int key : bidMap.keySet()) {
                    bidID = bidMap.get(key).getBidID();
                    bidPrice = bidMap.get(key).getBidPrice();
                    bidDate = bidMap.get(key).getBidDate();
                    System.out.println(String.format(" | %10d | %10d | %10f | %15s | ", key, bidID, bidPrice, bidDate));
                }
                System.out.println("---------------------------------------------------------------------------------------------");

            }catch (Exception NullPointerException){
                System.out.println("No bid is entered");
            }

        }

    }
    public void displayBuyer(){
        System.out.printf(" | %5s | %15s | %15s | ","Buyer ID","Buyer Given Name","Buyer Family Name");
        System.out.println();

        for(int key:buyerHashMap.keySet()){
            Buyer buyer=buyerHashMap.get(key);
            System.out.println(String.format(" | %5d | %15s | %15s | " ,buyer.getBuyerId(), buyer.getGivenName(), buyer.getFamilyName()));
        }
    }

    public void createBid(){
        System.out.println("Enter Vehicle ID");
        int vID=Integer.parseInt(scan.nextLine());

        System.out.println("Enter Buyer ID :");
        int buyerID = Integer.parseInt(scan.nextLine());

        System.out.println("Enter Bid Price");
        double bidPrice = Double.parseDouble(scan.nextLine());

        System.out.println("Enter Bid Date");
        String bidDate = scan.nextLine();

        for (int i=0;i<vehicles.size();i++){
            if(vehicles.get(i).getvId()==vID){
                vehicles.get(i).getBidsManager().addBid(buyerID,bidPrice,bidDate);
                break;
            }
        }
    }




    public int nextID() {
        Random r = new Random();
        int low = 10000;
        int high = 99999;
        return (r.nextInt(high - low) + low);
    }

}
