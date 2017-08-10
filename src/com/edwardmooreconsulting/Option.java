package com.edwardmooreconsulting;

/**
 * Created by K317530 on 13/06/2017.
 */
public class Option {
    public boolean exists = false;
    private String option;
    private double cost;

    public Option(String option) {

        switch(option){
            case "BBQ Sauce":
                this.cost = 1.1;
                this.option = option;
                exists = true;
                break;
            case "Lettuce":
                this.cost = 2.2;
                this.option = option;
                exists = true;
                break;
            case "Tomato":
                this.cost = 3.3;
                this.option = option;
                exists = true;
                break;
            case "Cheese":
                this.cost = 4.4;
                this.option = option;
                exists = true;
                break;
            case "Onion":
                this.cost = 5.5;
                this.option = option;
                exists = true;
                break;
            default:
                this.option = "NULL OR INVALID OPTION " + option + " SELECTED";
                this.cost = -1;
                exists = false;
        }

    }

    public String getOption() {
        return option;
    }

    public double getCost() {
        return cost;
    }
}
