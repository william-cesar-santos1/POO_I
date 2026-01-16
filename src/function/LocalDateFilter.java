package function;

import java.time.LocalDate;
import java.util.function.Predicate;

public class LocalDateFilter implements Predicate<LocalDate> {

    private final LocalDate baseDate;

    public LocalDateFilter(LocalDate baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    public boolean test(LocalDate localDate) {
        return localDate.isAfter(baseDate);
    }

}
