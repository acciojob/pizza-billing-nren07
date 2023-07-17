package com.driver;

public class Pizza {


    private boolean cheese=false;
    private boolean topping=false;
    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price=300;
            bill=new String("");
            this.bill="Base Price Of The Pizza: "+this.price+"\n";
        }else{
            this.price=400;
            this.bill="Base Price Of The Pizza: "+this.price+"\n";
        }
        // your code goes here

    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.cheese){
            this.price+=80;
            this.cheese=true;
            this.bill+="Extra Cheese Added: "+80+"\n";

        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            if(!this.topping){
                this.price+=70;
                this.topping=true;
                this.bill+="Extra Toppings Added: "+70+"\n";
            }
        }else{
            if(!this.topping){
                this.price+=120;
                this.topping=true;
                this.bill+="Extra Toppings Added: "+120+"\n";
            }
        }
    }

    public void addTakeaway(){
        this.price+=20;
        this.bill+="Paperbag Added: "+20+"\n";
    }

    public String getBill(){
        // your code goes here
        this.bill+="Total Price: "+price+"\n";
        return this.bill;
    }
}
