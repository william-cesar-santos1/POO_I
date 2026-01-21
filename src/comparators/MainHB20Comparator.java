package comparators;

import impl.HB20;
import inherits.Motor10Turbo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainHB20Comparator {

    public static void main(String[] args) {
        // Gere uma lista de objetos HB20 com diferentes anos e modelos
        List<HB20> carros = Arrays.asList(
                new HB20("Branco", "HB20", 2020, new Motor10Turbo()),
                new HB20("Preto", "HB20X", 2019, new Motor10Turbo()),
                new HB20("Vermelho", "HB20", 2021, new Motor10Turbo())
        );

        Comparator<HB20> comparator2 = (left, right) -> {
            var compare = left.getModel().compareTo(right.getModel());
            if (compare == 0){
                compare = right.getCor().compareTo(left.getCor());
                if (compare == 0){
                    compare = Integer.compare(left.getPortAmount(), right.getPortAmount());
                }
            }
            return compare;
        };
        carros.sort(
                Comparator.comparing(
                        HB20::getModel, String::compareTo
                ).thenComparing(
                        HB20::getCor, String::compareTo
                ).thenComparing(
                        HB20::getPortAmount, Integer::compareTo
                )
        );

        carros.forEach(System.out::println);
    }
}
