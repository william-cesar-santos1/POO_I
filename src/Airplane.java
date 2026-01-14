public class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Avião: Iniciando motores");
        System.out.println("Avião: Taxiando na pista");
        System.out.println("Avião: Decolando");
        System.out.println("Avião: Voando");
    }

}
