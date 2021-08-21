package edu.monash.fit2099.buyers;

public class Buyer {
    int buyerId;
    String givenName;
    String familyName;
    // The reason here why the givenName/familyName is used rather than firstName/lastName is because
    // different races of ppl might have different understanding on first name and last name.
    // For example, some of the chinese people's name is start from the last name which is the family.
    // Therefore, the givenName and familyName is used to avoid the confusion and enter the wrong Name.


    public Buyer(int newBuyerId) {
        this.buyerId = newBuyerId;
    }

    public Buyer(int newBuyerId, String newGivenName, String newFamilyName) {
        this.buyerId = newBuyerId;
        this.givenName = newGivenName;
        this.familyName = newFamilyName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String description(){
        return "BuyerID:"+buyerId+" Name:"+givenName+" "+familyName;
    }
}

