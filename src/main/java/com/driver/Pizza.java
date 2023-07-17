package com.driver;

public class Pizza {


    private boolean cheese=false;
    private boolean topping=false;
    private boolean paperbeg=false;
    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            this.price=300;
        }else{
            this.price=400;
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
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            if(!this.topping){
                this.price+=70;
                this.topping=true;
            }
        }else{
            if(!this.topping){
                this.price+=120;
                this.topping=true;
            }
        }
    }

    public void addTakeaway(){
        if(!paperbeg){
            this.price+=20;
            paperbeg=true;
        }

    }

    public String getBill(){
        // your code goes here
        if(isVeg){
            bill="Base Price Of The Pizza: 300"+"\n";
            if(cheese) bill+="Extra Cheese Added: 80"+"\n";
            if(topping) bill+="Extra Toppings Added: 70"+"\n";
            if(paperbeg) bill+="Paperbag Added: 20"+"\n";
            this.bill+="Total Price: "+price+"\n";
        }else{
            bill="Base Price Of The Pizza: 400"+"\n";
            if(cheese) bill+="Extra Cheese Added: 80"+"\n";
            if(topping) bill+="Extra Toppings Added: 120"+"\n";
            if(paperbeg) bill+="Paperbag Added: 20"+"\n";
            this.bill+="Total Price: "+price+"\n";
        }
        return this.bill;
    }
}
