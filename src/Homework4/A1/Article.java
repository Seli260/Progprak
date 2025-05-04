package Homework4.A1;

    public abstract class Article {
        int discountThreshold;
        int householdLimit;

        public abstract int getBulkDiscount();

        public abstract boolean showWarning();
    }

