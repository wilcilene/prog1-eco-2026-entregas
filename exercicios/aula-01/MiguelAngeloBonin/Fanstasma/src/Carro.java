public class Carro {
    String modelo;
    boolean ligado;
    boolean fantasma;

    void ligar() {
        ligado = true;
        if (fantasma) {
            System.out.println("BUUUUUUU");
        } else {
            System.out.println("Carro ligado.");
        }
    }

    void desligar() {
        ligado = false;
        System.out.println("Carro desligado.");
    }
}