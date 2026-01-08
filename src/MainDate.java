import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MainDate {

    public static void main(String[] args) {
        parcelas(10);
    }

    public static void parcelas(int quantidade) {
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var diaAtual  = LocalDate.now();
        // Calcule o vencimento das próximas parcelas, respeitando a quantidade
    }

}
