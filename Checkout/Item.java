package Checkout;

class Item {

    private Character id;
    private int price;
    private boolean discounted = false;
    private int qty = 0;
    private int discount = 0;

    Item(char id, int price, boolean discounted, int qty, int discount) {
        this.id = id;
        this.price = price;
        this.discounted = discounted;
        this.qty = qty;
        this.discount = discount;
    }

    Item(char id, int price) {
        this.id = id;
        this.price = price;
    }

    Character getId() {
        return id;
    }

    int getPrice() {
        return price;
    }

    boolean isDiscounted() {
        return discounted;
    }

    int getQty() {
        return qty;
    }

    int getDiscount() {
        return discount;
    }
}
