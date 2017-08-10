package com.edwardmooreconsulting;

/**
 * Created by K317530 on 13/06/2017.
 */
public class Price {
    public Burger myBurger;
    public HealthyBurger myHealthyBurger;
    public PremiumBurger myPremiumBurger;

    public Price(Burger myBurger) {
        this.myBurger = myBurger;
    }
    public double total(Burger myBurger){
        double total;
        total = this.myBurger.myBun.getCost() + this.myBurger.myMeat.getCost();

        if(myBurger.opt1 !=  null){
            total = total + myBurger.opt1.getCost();
        }
        if(myBurger.opt2 !=  null){
            total = total + myBurger.opt2.getCost();
        }
        if(myBurger.opt3 !=  null){
            total = total + myBurger.opt3.getCost();
        }
        if(myBurger.opt4 !=  null){
            total = total + myBurger.opt4.getCost();
        }
        return total;
    }

    public Price(HealthyBurger myHealthyBurger) {
        this.myHealthyBurger = myHealthyBurger;
    }
    public double total(HealthyBurger myHealthyBurger){
        double total;
        total = this.myHealthyBurger.myBun.getCost() + this.myHealthyBurger.myMeat.getCost();

        if(myHealthyBurger.opt1 !=  null){
            total = total + myHealthyBurger.opt1.getCost();
        }
        if(myHealthyBurger.opt2 !=  null){
            total = total + myHealthyBurger.opt2.getCost();
        }
        if(myHealthyBurger.opt3 !=  null){
            total = total + myHealthyBurger.opt3.getCost();
        }
        if(myHealthyBurger.opt4 !=  null){
            total = total + myHealthyBurger.opt4.getCost();
        }
        if(myHealthyBurger.opt5 !=  null){
            total = total + myHealthyBurger.opt5.getCost();
        }
        if(myHealthyBurger.opt6 !=  null){
            total = total + myHealthyBurger.opt6.getCost();
        }
        return total;
    }





    }
