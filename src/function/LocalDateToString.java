package function;

import java.time.LocalDate;
import java.util.function.Function;

import java.time.format.DateTimeFormatter;

public class LocalDateToString implements Function<LocalDate, String> {

    private final DateTimeFormatter formatter;

    public LocalDateToString(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public String apply(LocalDate date) {
        return date.format(formatter);
    }
}
