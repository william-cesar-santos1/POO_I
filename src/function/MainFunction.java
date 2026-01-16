package function;

import interfaces.Walkable;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainFunction {

    private List<Swimmers> swimmers = new ArrayList<>();

    public static void main(String[] args) {
        //https://struchkov.dev/blog/ru/content/images/2021/10/------------8.png
        MainFunction mainFunction = new MainFunction();
        mainFunction.start();
    }

    public void start() {
        swimmers.add(new Fish());
        swimmers.add(new Crab());
        swimmers.add(new JellyFish());

        Predicate<Swimmers> filter = new FishFilter();
        // Lambda
        // tipo variável = (parâmetros) -> expressão ou bloco
        Predicate<Swimmers> filterLambda =
                (Swimmers swimmers) -> swimmers instanceof Fish;

        List<CanFish> cansFish = swimmers.stream()
                .filter(swimmers -> swimmers instanceof Fish)
                .map(new SwimmersConverterToCanFish())
                .collect(Collectors.toList());
        System.out.println(cansFish);
    }

}
