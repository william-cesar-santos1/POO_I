package function;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MainFunction {

    private List<Swimmers> swimmers = new ArrayList<>();

    public static void main(String[] args) {
        MainFunction mainFunction = new MainFunction();
        mainFunction.start();
    }

    public void start() {
        swimmers.add(new Fish());
        swimmers.add(new Crab());
        swimmers.add(new JellyFish());

        swimmers.stream()
                .filter(new FishFilter())
                .forEach(fish ->
                        System.out.println(fish.getClass().getSimpleName()));
    }

}
