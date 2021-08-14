public class Bid {
    private int bidID;
    private Buyer buyer;
    private int bidPrice;
    private String bidDate;

    public Bid(int bidID, Buyer buyer, int bidPrice, String bidDate) {
        this.bidID = bidID;
        this.buyer = buyer;
        this.bidPrice = bidPrice;
        this.bidDate = bidDate;
    }

    public int getBidID() {
        return bidID;
    }

    public void setBidID(int bidID) {
        this.bidID = bidID;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public int getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(int bidPrice) {
        this.bidPrice = bidPrice;
    }

    public String getBidDate() {
        return bidDate;
    }

    public void setBidDate(String bidDate) {
        this.bidDate = bidDate;
    }
}
