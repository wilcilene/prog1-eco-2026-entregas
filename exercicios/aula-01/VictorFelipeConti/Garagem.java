import java.util.ArrayList;
public class Garagem {
    ArrayList<Carro> carros = new ArrayList();

    void adicionarCarro(Carro c) {
        carros.add(c);
    }

    void listarCarros() {
        System.out.println("Carros na garagem: ");
        for ( Carro c : carros) {
            System.out.println("- " + c.modelo);
        }
    }

    void ligarTodos() {
        System.out.println("Ligando todos os carros...");
        for (Carro c : carros) {
            c.ligar();
        }
    }
}
