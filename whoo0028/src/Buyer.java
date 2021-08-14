public class Buyer {
    int buyerId;
    String givenName;
    String familyName;

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
    public String description(){
        return "BuyerID:"+buyerId+"Name:"+givenName+" "+familyName;
    }
}
