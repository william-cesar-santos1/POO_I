//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import impl.HB20;
import inherits.Motor;
import inherits.Motor10Turbo;
import inherits.Motor16;

public static void main(String[] args) {
    Motor motor10 = new Motor10Turbo();

    // Brasil -> Super class
    // Paraná -> Sub class
    // Posso sempre dizer que a sub class é do tipo super class
    // Não posso dizer que a super class é do tipo sub class
    // Todos os paranaenses são brasileiros
    // Nem todos os brasileiros são paranaenses

    HB20 hb20Branco = new HB20(
            "Confort Plus",
            4,
            motor10
    );
    hb20Branco.setCor("Branco");
    hb20Branco.ligar();
    hb20Branco.acelerar();
    hb20Branco.acelerar();
    hb20Branco.acelerar();
    System.out.println(hb20Branco);

    HB20 hb20Preto = new HB20(
            "Evolution",
            4,
            new Motor16()
    );
    hb20Preto.setCor("Preto");
    hb20Preto.acelerar();
    hb20Preto.acelerar();
    hb20Preto.acelerar();
    System.out.println(hb20Preto);
}