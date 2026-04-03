public class Carro {
    String cor;
    String marca;
    String modelo;
    boolean ligado;
    void ligar() {
        ligado = true;
        System.out.println("Carro ligado.");
    }
    void desligar() {
        ligado = false;
        System.out.println("Carro desligado.");
    }
}
