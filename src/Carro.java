import java.util.Objects;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    // Construtor
    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    // Método toString para exibir informações do carro
    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return ano == carro.ano &&
                Objects.equals(modelo, carro.modelo) &&
                Objects.equals(cor, carro.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, ano, cor);
    }
}
