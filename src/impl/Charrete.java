package impl;

public class Charrete {

    private int assentos;
    private Cavalo cavalo;
    private float velocidadeAtual;

    public Charrete(
            int assentos,
            Cavalo cavalo
    ) {
        this.assentos = assentos;
        this.cavalo = cavalo;
        this.velocidadeAtual = 0.0f;
    }

    public void acelerar() {
        velocidadeAtual += this.cavalo.produzirForca(1);
    }

    @Override
    public String toString() {
        return "impl.Charrete{" +
                "assentos=" + assentos +
                ", cavalo=" + cavalo +
                ", velocidadeAtual=" + velocidadeAtual +
                '}';
    }
}
