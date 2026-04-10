public class Carro {
    String modelo;
    boolean estaLigado;
    boolean modoFantasma;

    void ligar() {
        estaLigado = true;

        if (modoFantasma) {
            System.out.println("👻 Um carro fantasma surgiu misteriosamente!");
        } else {
            System.out.println("Carro ligado com sucesso.");
        }
    }

    void desligar() {
        if (estaLigado) {
            estaLigado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }
}

public class TesteCarros {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.modelo = "City Turbo";
        carro1.modoFantasma = false;

        Carro carro2 = new Carro();
        carro2.modelo = "Ghost Racer";
        carro2.modoFantasma = true;

        System.out.println("=== Teste carro normal ===");
        carro1.ligar();
        carro1.desligar();

        System.out.println("\n=== Teste carro fantasma ===");
        carro2.ligar();
        carro2.desligar();
    }
}