package com.driver;

public class DeluxePizza extends Pizza {
    private int price;
    private String bill;

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        super.addExtraCheese();
        super.addExtraToppings();
        this.price=super.getPrice();
        this.bill=super.getBill();
    }
}
