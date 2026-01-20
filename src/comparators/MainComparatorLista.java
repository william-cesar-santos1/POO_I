package comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainComparatorLista {

    public static void main(String[] args) {
        List<Integer> numerosAleatorios = Arrays.asList(1, 5, 69, 8, 95, 16, 456, 489, 65, 13, 85, 87, 78, 4, 101);

        // Aqui eu declaro a função
        Comparator<Integer> crescente = (left, right) -> {
            System.out.println("Comparando " + left + " e " + right);
            return left - right;
        };

        // O sort executa a função várias vezes, até que a lista esteja ordenada
        numerosAleatorios.sort(crescente);
        System.out.println(numerosAleatorios);

//        numerosAleatorios.sort(Comparator.comparing(Integer::intValue));
//        numerosAleatorios.sort(Integer::compareTo);

        // Mude a forma de ordenar para que a lista fique em ordem decrescente
        Comparator<Integer> decrescente = (left, right) -> {
            System.out.println("Comparando " + left + " e " + right);
            return right - left;
        };
        numerosAleatorios.sort(decrescente);
        //numerosAleatorios.sort(crescente.reversed());
        //numerosAleatorios.sort(Comparator.comparing(Integer::intValue).reversed());

        System.out.println(numerosAleatorios);
    }
}
