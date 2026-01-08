import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainDate {

    public static void main(String[] args) {
        parcelas(10);
    }

    public static void parcelas(int quantidade) {
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Calcule o vencimento das próximas parcelas, respeitando a quantidade
        /**
         * 1 vence dia 08/02/2024
         * 2 vence dia 08/03/2024
         * 3 vence dia 08/04/2024
         * ...
         */
        var vencimento = LocalDate.now();
        for (int index = 1; index <= quantidade; index++) {
            vencimento = vencimento.plusMonths(1);
            System.out.println("Parcela " + index + " vence dia " + formatter.format(vencimento));
        }
    }

}
