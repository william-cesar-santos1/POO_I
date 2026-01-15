package impl;

import interfaces.Flyable;

public class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Avião: Iniciando motores");
        System.out.println("Avião: Taxiando na pista");
        System.out.println("Avião: Decolando");
        System.out.println("Avião: Voando");
    }

    @Override
    public void land() {
        System.out.println("Avião: Iniciando descida");
        System.out.println("Avião: Aproximando-se da pista");
        System.out.println("Avião: Tocando a pista");
        System.out.println("Avião: Taxiando até o portão");
    }

}
