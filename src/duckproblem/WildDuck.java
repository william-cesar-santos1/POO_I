package duckproblem;

import interfaces.Flyable;

public class WildDuck extends Duck implements Flyable {

    public WildDuck(){
        super("Wild Duck");
    }

    @Override
    public void fly() {
        System.out.println("Wild duck is flying long distances.");
    }

    @Override
    public void land() {
        System.out.println("Wild duck is landing.");
    }
}
