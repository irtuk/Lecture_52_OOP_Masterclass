package com.edwardmooreconsulting;

/**
 * Created by K317530 on 13/06/2017.
 */
public class Burger {
    public Bun myBun;
    public Meat myMeat;
    public Option opt1;
    public Option opt2;
    public Option opt3;
    public Option opt4;

    public Burger(Bun myBun, Meat myMeat) {
        this.myBun = myBun;
        this.myMeat = myMeat;
        System.out.println("Building a " + myMeat.getMeat() + " burger on " + myBun.getBread() + " bread");

        }
    public Burger(Bun myBun, Meat myMeat, Option opt1) {
        this.myBun = myBun;
        this.myMeat = myMeat;
        this.opt1 = opt1;
        System.out.println("Building a " + myMeat.getMeat() + " burger on " + myBun.getBread() + " bread with " + opt1.getOption() );

    }
    public Burger(Bun myBun, Meat myMeat, Option opt1, Option opt2) {
        this.myBun = myBun;
        this.myMeat = myMeat;
        this.opt1 = opt1;
        this.opt2 = opt2;
        System.out.println("Building a " + myMeat.getMeat() + " burger on " + myBun.getBread() + " bread with " + opt1.getOption() + " and " + opt2.getOption());

    }
    public Burger(Bun myBun, Meat myMeat, Option opt1, Option opt2, Option opt3) {
        this.myBun = myBun;
        this.myMeat = myMeat;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        System.out.println("Building a " + myMeat.getMeat() + " burger on " + myBun.getBread() + " bread with " + opt1.getOption() + " and " + opt2.getOption()  + " and " + opt3.getOption());

    }
    public Burger(Bun myBun, Meat myMeat, Option opt1, Option opt2, Option opt3, Option opt4) {
        this.myBun = myBun;
        this.myMeat = myMeat;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        System.out.println("Building a " + myMeat.getMeat() + " burger on " + myBun.getBread() + " bread with " + opt1.getOption() + " and " + opt2.getOption()  + " and " + opt3.getOption() + " and " + opt4.getOption() );

    }




}

class HealthyBurger extends Burger{
    public Option opt5;
    public Option opt6;
    Bun myBun = new Bun("Rye");
    public HealthyBurger(Bun myBun, Meat myMeat) {
        super(myBun, myMeat);
        System.out.println("This is a healthy burger with no options");

        System.out.println("Cost :" + myBun.getCost() + myMeat.getCost());
    }
    public HealthyBurger(Bun myBun, Meat myMeat, Option opt1) {
        super(myBun, myMeat, opt1);

        System.out.println("This is a healthy burger with one option");

    }
    public HealthyBurger(Bun myBun, Meat myMeat, Option opt1, Option opt2) {
        super(myBun, myMeat, opt1, opt2);
        System.out.println("This has to be a healthy burger with 2 options");

    }
    public HealthyBurger(Bun myBun, Meat myMeat, Option opt1, Option opt2, Option opt3) {
        super(myBun, myMeat, opt1, opt2, opt3);

        System.out.println("This healthy burger with three options");
    }
    public HealthyBurger(Bun myBun, Meat myMeat, Option opt1, Option opt2, Option opt3, Option opt4) {
        super(myBun, myMeat, opt1, opt2, opt3, opt4);
        System.out.println("This is a healthy burger with four options");
    }
    public HealthyBurger(Bun myBun, Meat myMeat, Option opt1, Option opt2, Option opt3, Option opt4, Option opt5) {
        super(myBun, myMeat, opt1, opt2, opt3, opt4);
        this.opt5 = opt5;
        System.out.println("This has to be a healthy burger option as it has five options");
    }
    public HealthyBurger(Bun myBun, Meat myMeat, Option opt1, Option opt2, Option opt3, Option opt4, Option opt5, Option opt6) {
        super(myBun, myMeat, opt1, opt2, opt3, opt4);
        this.opt5 = opt5;
        this.opt6 = opt6;
        System.out.println("This has to be a healthy burger option as it has six options");
    }
}

class PremiumBurger extends Burger{
 private double chipCost = 10;
 private double drinkCost = 5;

    public PremiumBurger(Bun myBun, Meat myMeat) {
        super(myBun, myMeat);
    }

}












