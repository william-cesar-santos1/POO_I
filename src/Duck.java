public class Duck implements Flyable, Walkable, Swiming{

    @Override
    public void fly() {
        System.out.println("Pato: esta correndo");
        System.out.println("Pato: batendo assas");
        System.out.println("Pato: decolou voo");
    }

    @Override
    public void arrive() {
        System.out.println("Pato: se preparando para pousar");
        System.out.println("Pato: aproximando do chao");
        System.out.println("Pato: pousou");
    }

    @Override
    public void swim() {
        System.out.println("Pato: entrando na agua");
    }

    @Override
    public void walk() {
        System.out.println("Pato: andando no chao");
    }
}
