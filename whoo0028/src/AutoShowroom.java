import com.sun.source.doctree.SystemPropertyTree;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AutoShowroom {
    ArrayList<Car> cars;
    ArrayList<Buyer> buyer;


    public void MainMenu(){
        Scanner scan =new Scanner(System.in);
        int choice=0;
        int carSelection=0;
        int price;
        String givenName="";
        String familyName="";
        Buyer buyer;
        String date;
        createCars();
        do {
            System.out.println("Main Menu:");
            System.out.println("1. Add Bid");
            System.out.println("2. Select car and print bid");
            System.out.println("3. Check Buyer");
            System.out.println("4. Exit");
            choice = scan.nextInt();
            scan.nextLine();
            if (choice == 1) {
                System.out.println("Select car that you want to bid");
                displayCars();
                carSelection=scan.nextInt();
                scan.nextLine();
                System.out.print("Enter buyer given name");
                givenName = scan.nextLine();
                System.out.println("Enter buyer family name");
                familyName = scan.nextLine();
                buyer=new Buyer(nextID(),givenName,familyName);
                System.out.println("Enter the price you want to bid");
                price=scan.nextInt();
                scan.nextLine();
                System.out.println("Enter date");
                date=scan.nextLine();
                cars.get(carSelection-1).addBid(buyer,price,date);
            }
            if (choice == 2){
                displayCars();
                carSelection=scan.nextInt();
                scan.nextLine();
                ArrayList<Bid> bidHist = cars.get(carSelection-1).getBidHist();
                System.out.println("BidID       BuyerDescription            BidPrice     Date");
                for (int i=0;i<bidHist.size();i++){
                    Bid bid= bidHist.get(i);
                    System.out.println(String.format("%d      %s    %d          %s",bid.getBidID(),bid.getBuyer().description(),bid.getBidPrice(),bid.getBidDate()));
                }

            }
        }while(choice!=4);
    }

    public void printStatus(){
        System.out.println("Welcome to FIT2099 Showroom");
        createCars();
        displayCars();
        System.out.println("Thank you for visiting FIT2099 Showroom");
    }
    public void createCars(){
        cars = new ArrayList<Car>();
        cars.add(new Car("BMW","X5"));
        cars.add(new Car("Audi","R8"));
        cars.add(new Car("Mercedes-Benz","G63"));

    }
    public void displayCars(){
        for(int i=0;i<cars.size();i++){
            System.out.println(String.format("Car (%d) Maker:%s and Model:%s",i+1,cars.get(i).getMaker(),cars.get(i).getModel()));
        }
    }


    public int nextID() {
        Random r = new Random();
        int low = 10000;
        int high = 99999;
        return (r.nextInt(high - low) + low);
    }

}
