package Homework4.A1;

public class Flour extends PopularGrocery {
    public Flour(int quantity, int discountThreshold, int popularityLevel) {
        super(popularityLevel);
        this.quantity = quantity;
        this.discountThreshold = discountThreshold;
        this.householdLimit = 15;
    }

    public int getBulkDiscount() {
        return this.quantity >= this.discountThreshold ? 5 : 0;
    }
}
