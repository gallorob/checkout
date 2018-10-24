public class Item {

    private Character id;
    private int price;
    private boolean discounted;
    private int qty;
    private int discount;

    public Item(char id) {
        this.id = id;
        switch (id) {
            case 'A':
                this.price = 50;
                this.discounted = true;
                this.qty = 3;
                this.discount = 20;
                break;
            case 'B':
                this.price = 30;
                this.discounted = true;
                this.qty = 2;
                this.discount = 10;
                break;
            case 'C':
                this.price = 20;
                this.discounted = false;
                break;
            case 'D':
                this.price = 15;
                this.discounted = false;
                break;
        }
    }

    public Character getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public boolean isDiscounted() {
        return discounted;
    }

    public int getQty() {
        return qty;
    }

    public int getDiscount() {
        return discount;
    }
}
