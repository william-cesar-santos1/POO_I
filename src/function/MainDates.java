package function;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MainDates {

    private List<LocalDate> dates = new ArrayList<>();

    public static void main(String[] args) {
        MainDates mainDates = new MainDates();
        mainDates.start();
    }

    public void start() {
        dates.add(LocalDate.of(2020, 1, 15));
        dates.add(LocalDate.of(2021, 6, 30));
        dates.add(LocalDate.of(2019, 12, 5));
        dates.add(LocalDate.of(2022, 3, 10));

        // Aplique um filtro, utilizando a API de stream,
        // para obter apenas as datas posteriores a 31 de dezembro de 2020
        var dateBase = LocalDate.of(2020, 12, 31);
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dates.stream()
                .filter(new LocalDateFilter(dateBase))
                // Até aqui temos um LocalDate. Porém, sem nenhum tipo de formatação.
                // Aplique uma formatação para utilizar o padrão
                // brasileiro de datas (dd/MM/yyyy)
                // LocalDate -> String
                .map(new LocalDateToString(formatter))
                .forEach(System.out::println);
    }

}
