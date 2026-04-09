// Classe Carro: definição do "molde" (classe)
public class Carro {

    // Atributos (estado)
    String cor;
    String marca;
    String modelo;
    int ano;
    double preco;
    boolean ligado;

    // Métodos (comportamento)
    void ligar() {
        ligado = true;
        System.out.println("Carro ligado.");
    }

    void desligar() {
        ligado = false;
        System.out.println("Carro desligado.");
    }
}