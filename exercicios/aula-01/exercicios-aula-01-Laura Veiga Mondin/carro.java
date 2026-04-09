// Classe Carro: definição do "molde" (classe)
public class Carro {

    // Atributos (estado)
    String cor;
    String marca;
    String modelo;
    int ano;
    double preco;
    boolean fantasma;

    // Métodos (comportamento)
    void venha_fantasma() {
        fantasma = true;
        System.out.println("Carro fantasma apareceu do nada!");
    }

}
