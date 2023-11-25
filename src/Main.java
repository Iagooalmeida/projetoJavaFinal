import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<Recarregavel> recarregaveisArrayList = new ArrayList<>();
    public static List<Recarregavel> recarregaveisLinkedList = new LinkedList<>();

    public static void main(String[] args) {
        Carro carro1, carroEletrico1;

        carro1 = new Carro("Fusca", 1980, "Azul");
        carroEletrico1 = new CarroEletrico("Tesla Model S", 2022, "Preto", 300);

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(carro1);
        listaCarros.add(carroEletrico1);

        // Verificando se o objeto é recarregável antes de adicionar às listas
        for (Carro carro : listaCarros) {
            if (carro instanceof Recarregavel) {
                ((Recarregavel) carro).recarregarBateria();
                recarregaveisArrayList.add((Recarregavel) carro);
                recarregaveisLinkedList.add((Recarregavel) carro);
            }
        }

        // Iterando sobre a lista ArrayList e exibindo informações
        System.out.println("Recarregáveis (ArrayList):");
        for (Recarregavel recarregavel : recarregaveisArrayList) {
            System.out.println(recarregavel);
        }

        // Iterando sobre a lista LinkedList e exibindo informações
        System.out.println("\nRecarregáveis (LinkedList):");
        for (Recarregavel recarregavel : recarregaveisLinkedList) {
            System.out.println(recarregavel);
        }
    }
}
