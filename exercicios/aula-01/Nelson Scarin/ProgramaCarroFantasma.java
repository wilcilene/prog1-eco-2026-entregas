class Carro {
    String modelo;
    boolean ligado;
    boolean fantasma;

    Carro(String modelo, boolean fantasma) {
        this.modelo = modelo;
        this.fantasma = fantasma;
    }

    void ligar() {
        if (ligado) {
            System.out.println("O carro já está ligado: " + modelo);
            return;
        }
        ligado = true;
        if (fantasma) {
            System.out.println("Carro fantasma apareceu do nada!");
        } else {
            System.out.println("Carro ligado. Modelo: " + modelo);
        }
    }

    void desligar() {
        if (!ligado) {
            System.out.println("O carro já está desligado: " + modelo);
            return;
        }
        ligado = false;
        System.out.println("Carro desligado. Modelo: " + modelo);
    }
}

public class ProgramaCarroFantasma {
    public static void main(String[] args) {
        Carro carroNormal = new Carro("Sedan Confort", false);
        Carro carroFantasma = new Carro("Phantom Runner", true);

        System.out.println("Ligando o carro normal:");
        carroNormal.ligar();

        System.out.println("\nLigando o carro fantasma:");
        carroFantasma.ligar();

        System.out.println("\nDesligando os carros:");
        carroNormal.desligar();
        carroFantasma.desligar();
    }
}