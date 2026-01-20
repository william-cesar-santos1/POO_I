package comparators;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MainCalculoNumeroInteiros {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 5, 69, 8, 95, 16, 456, 489, 65, 13, 85, 87, 78, 4, 101);

        Integer acumulador = 0;
        for (Integer numero : numeros) {
            acumulador += numero;
        }
        System.out.println("Soma dos números: " + acumulador);

        numeros.stream()
                .reduce((first, second) -> first + second)
                .ifPresent(soma ->
                        System.out.println("Soma dos números (stream): " + soma)
                );
    }

}
