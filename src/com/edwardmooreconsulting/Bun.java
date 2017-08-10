package com.edwardmooreconsulting;

/**
 * Created by K317530 on 13/06/2017.
 */
public class Bun {
    private String bread;
    private double cost;

    public Bun(String bread) {
        switch(bread){
            case "White":
                this.bread = bread;
                this.cost = 1.15;
                break;
            case "Brown":
                this.bread = bread;
                this.cost = 2.25;
                break;
            case "Rye":
                this.bread = bread;
                this.cost = 3.35;
                break;
            case "Wholemeal":
                this.bread = bread;
                this.cost = 4.45;
                break;
            default:
                this.bread = "INVALID BREAD OPTION";
                this.cost = -1;
        }
    }

    public String getBread() {
        return bread;
    }

    public double getCost() {
        return cost;
    }
}
