package function;

import java.util.function.Predicate;

public class FishFilter implements Predicate<Swimmers> {

    @Override
    public boolean test(Swimmers swimmers) {
        return swimmers instanceof Fish;
    }

}
