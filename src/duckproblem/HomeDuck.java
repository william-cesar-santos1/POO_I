package duckproblem;

import interfaces.Flyable;

public class HomeDuck extends Duck implements Flyable {

    public HomeDuck(){
        super("Home Duck");
    }

    @Override
    public void fly() {
        System.out.println("Home duck is flying short distances.");
    }

    @Override
    public void land() {
        System.out.println("Home duck is landing.");
    }
}
