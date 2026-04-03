import java.util.ArrayList;
import java.util.List;
public class Garagem {
    private List<Carro> carros;

    public Garagem() {
        this.carros = new ArrayList<>();
    }
    public void adicionarCarro(Carro c) {
        this.carros.add(c);
        System.out.println("Carro " + c.getModelo() + " adicionado à garagem.");
    }
    public void listarCarros() {
        System.out.println("\n--- Carros na Garagem ---");
        if (carros.isEmpty()) {
            System.out.println("A garagem está vazia.");
        } else {
            for (Carro c : carros) {
                System.out.println(c.toString());
            }
        }
        System.out.println("-------------------------\n");
    }
    public void ligarTodos() {
        System.out.println("Ligando todos os carros da garagem...");
        for (Carro c : carros) {
            c.ligar();
        }
    }
}
