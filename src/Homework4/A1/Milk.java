package Homework4.A1;

public class Milk extends PopularGrocery {
    public Milk(int quantity, int discountThreshold, int popularityLevel) {
        super(popularityLevel);
        this.discountThreshold = discountThreshold;
        this.quantity = quantity;
        this.householdLimit = 20;
    }

    public int getBulkDiscount() {
        return this.quantity >= this.discountThreshold ? 12 : 0;
    }
}
