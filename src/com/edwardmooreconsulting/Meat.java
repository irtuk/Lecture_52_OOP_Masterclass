package com.edwardmooreconsulting;

/**
 * Created by K317530 on 13/06/2017.
 */
public class Meat {
    private String meat;
    private double cost;

    public Meat(String meat) {

        switch (meat){
            case "Beef":
                this.meat=meat;
                this.cost = 1.10;
                break;
            case "Lamb":
                this.meat=meat;
                this.cost=2.20;
                break;
            case "Ham":
                this.meat=meat;
                this.cost = 3.30;
                break;
            case "Duck":
                this.meat=meat;
                this.cost=4.44;
                break;
            case "Camel":
                this.meat=meat;
                this.cost = 5.55;
                break;
            default:
                this.meat = "INVALID MEAT OPTION";
                this.cost = -1;
        }
    }

    public String getMeat() {
        return meat;
    }

    public double getCost() {
        return (double) cost;
    }
}
