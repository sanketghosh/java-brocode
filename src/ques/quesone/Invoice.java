package ques.quesone;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int purchasedItem;
    private double priceOfItem;

    Invoice(String partNumber, String partDescription, int purchasedItem, double priceOfItem) {

//        this.partNumber = partNumber;
//        this.partDescription = partDescription;
//        this.purchasedItem = purchasedItem;
//        this.priceOFItem = priceOFItem;
        this.setPartNumber(partNumber);
        this.setPartDescription(partDescription);
        this.setPurchasedItem(purchasedItem);
        this.setPriceOfItem(priceOfItem);

    }

    // getters and setters methods

    // getters
    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getPurchasedItem() {
        return purchasedItem;
    }

    public double getPriceOfItem() {
        return priceOfItem;
    }

    public double getInvoiceAmount() {
        if (purchasedItem < 0) {
            purchasedItem = 0;
        }
        if (priceOfItem < 0.0) {
            priceOfItem = 0.0;
        }

        double invoiceAmount = purchasedItem * priceOfItem;
        return invoiceAmount;
    }

    // setters

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setPurchasedItem(int purchasedItem) {
        this.purchasedItem = purchasedItem;
    }

    public void setPriceOfItem(double priceOfItem) {
        this.priceOfItem = priceOfItem;
    }


}
