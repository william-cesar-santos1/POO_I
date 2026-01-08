import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class MainTime {

    public static void main(String[] args) {
        var formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        var london = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(formatter.withLocale(Locale.UK).format(london));

        var australia = london.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
        System.out.println(formatter.withLocale(new Locale("en", "AU")).format(australia));

        var brasillll = london.withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));
        System.out.println(formatter.withLocale(new Locale("pt", "BR")).format(brasillll));

//        var estelaWasBorn = "04/07/2025 17:04:00";
//        var data = formatter.parse(estelaWasBorn, LocalDateTime::from);
//        System.out.println(data);
    }

}
