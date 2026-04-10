package GhostCar;

public class Car {
    String modelo;
    boolean ligado;
    boolean fantasma;

    void ligar() {
        ligado = true;
        if (fantasma) {
            System.out.println("Cofre do diabo apareceu do nada AAAAA!");
        } else {
            System.out.println("Carro ligado.");
        }
    }

    void desligar() {
        ligado = false;
        System.out.println("Carro desligado.");
    }
}
