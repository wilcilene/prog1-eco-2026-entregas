public class Car {
    String modelo;
    boolean ligado;
    boolean fantasma;

    void ligar() {
        ligado = true;
        if (fantasma) {
            System.out.println("Carro fantasma apareceu do nada!");

        } else {
            System.out.println("Carro ligado.");
        }
    }
    void desligar() {
        ligado = false;
        System.out.println("Carro desligado.");
    }
}
