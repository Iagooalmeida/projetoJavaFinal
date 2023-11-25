public class CarroEletrico extends Carro implements Recarregavel {
    private int autonomiaBateria;

    // Construtor
    public CarroEletrico(String modelo, int ano, String cor, int autonomiaBateria) {
        super(modelo, ano, cor);
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public void recarregarBateria() {
        System.out.println("Recarregando a bateria do carro elétrico...");
    }
}
