package com.edwardmooreconsulting;

public class Main {

    public static void main(String[] args) {

        Price thePrice;

        Bun newBun = new Bun("White");
        Meat newMeat = new Meat("Beef");

        Option opt1 = new Option ("Onion");
        Option opt2 = new Option ("Onion");
        Option opt3 = new Option ("Onion");
        Option opt4 = new Option ("Onion");
        Option opt5 = new Option ("Onion");
        Option opt6 = new Option ("Onion");
//
//       Burger newBurger = new Burger(newBun, newMeat, opt1, opt2, opt3, opt4);
//
//        thePrice = new Price(newBurger);
//        System.out.println("Cost: " + thePrice.total(newBurger));

        HealthyBurger newHealthyBurger = new HealthyBurger(newBun,newMeat,opt1,opt2,opt3,opt4,opt5,opt6);
        thePrice  = new Price(newHealthyBurger);
        System.out.println("Cost: " + thePrice.total(newHealthyBurger));


    }




}
