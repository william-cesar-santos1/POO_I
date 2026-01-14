public class MainInterfaceGeneric {

    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        makeFly(airplane);

        Duck duck = new Duck();
        makeFly(duck);
    }

    public static void makeFly(Flyable flyable) {
        flyable.fly();
    }

}
