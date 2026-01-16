package function;

import java.time.LocalDate;
import java.util.function.Predicate;

public class LocalDateFilter implements Predicate<LocalDate> {

    private final LocalDate baseDate = LocalDate.of(2020, 12, 31);

    @Override
    public boolean test(LocalDate localDate) {
        return localDate.isAfter(baseDate);
    }

}
