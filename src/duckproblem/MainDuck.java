package duckproblem;

import interfaces.Flyable;

public class MainDuck {

    public static void main(String[] args) {
        HomeDuck homeDuck = new HomeDuck();
        makeDuckFly(homeDuck);

        WildDuck wildDuck = new WildDuck();
        makeDuckFly(wildDuck);
        // SOLID
        // S - Single Responsibility Principle
        // O - Open/Closed Principle
        // L - Liskov Substitution Principle
        // I - Interface Segregation Principle
        // D - Dependency Inversion Principle

        RubbleDuck rubbleDuck = new RubbleDuck();
        //makeDuckFly(rubbleDuck);
    }

    public static void makeDuckFly(Flyable flyable) {
        flyable.fly();
    }

}
