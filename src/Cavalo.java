public class Cavalo implements ProduzirForca{

    private String nome;

    public Cavalo(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cavalo{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public float produzirForca(float alimentacao) {
        return alimentacao * 0.8f;
    }

}
