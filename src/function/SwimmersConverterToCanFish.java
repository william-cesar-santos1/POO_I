package function;

import java.util.function.Function;

public class SwimmersConverterToCanFish implements Function<Swimmers, CanFish> {

    @Override
    public CanFish apply(Swimmers fish) {
        return new CanFish((Fish) fish);
    }

}
