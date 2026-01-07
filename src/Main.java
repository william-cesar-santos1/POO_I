//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public static void main(String[] args) {
    HB20 hb20Branco = new HB20(
            "Confort Plus",
            4,
            new Motor10Turbo()
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