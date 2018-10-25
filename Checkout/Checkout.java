package Checkout;

import java.util.HashMap;

public class Checkout {

    private int price;
    private PriceRules priceRules = new PriceRules();
    private HashMap<Character, Integer> itemCounter = new HashMap<>();

    public int total() {
        int tmp = this.price;
        resetAll();
        return tmp;
    }

    public int scan(String items) {
        for(char item : items.toCharArray()) {
            scan(item);
        }
        int tmp = this.price;
        resetAll();
        return tmp;
    }

    public void scan(char item) {
        Item product = priceRules.getProduct(item);
        this.price += product.getPrice();
        if(this.itemCounter.containsKey(product.getId())) {
            this.itemCounter.replace(product.getId(), this.itemCounter.get(product.getId()) + 1);
        } else {
            this.itemCounter.put(product.getId(), 1);
        }
        if(product.isDiscounted()) {
            if(product.getQty() == this.itemCounter.get(product.getId())) {
                this.price -= product.getDiscount();
                this.itemCounter.replace(product.getId(), 0);
            }
        }
    }

    private void resetAll() {
        this.itemCounter.clear();
        this.price = 0;
    }

}
