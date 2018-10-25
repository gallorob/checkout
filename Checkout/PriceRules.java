package Checkout;

class PriceRules {

    Item getProduct(char id) {
        Item product;
        int price = 0;
        boolean discounted = false;
        int qty = 0;
        int discount = 0;
        // values can be retrieved with a query from a db
        switch (id) {
            case 'A':
                price = 50;
                discounted = true;
                qty = 3;
                discount = 20;
                break;
            case 'B':
                price = 30;
                discounted = true;
                qty = 2;
                discount = 10;
                break;
            case 'C':
                price = 20;
                break;
            case 'D':
                price = 15;
                break;
        }
        if(discounted) {
            product = new Item(id, price, discounted, qty, discount);
        } else {
            product = new Item(id, price);
        }
        return product;
    }

}
