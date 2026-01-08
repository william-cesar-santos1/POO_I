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

    // Faça um calculo de juros compostos.
    // Você deve receber o valor inicial, a taxa de juros e a quantidade de meses.
    // Imprima o saldo a cada mês, até que chegue na quantidade de meses.
    public static void jurosCompostos(
            float valorInicial,
            float taxaJuros,
            int meses
    ) {
        /**
         * Saldo inicial: R$ 1.000,00
         * Saldo após 1 mês: R$ 1.050,00, data 08/02/2024
         * Saldo após 2 meses: R$ 1.102,50, data 08/03/2024
         * Saldo após 3 meses: R$ 1.157,62, data 08/04/2024
         * ...
         */
    }

}
