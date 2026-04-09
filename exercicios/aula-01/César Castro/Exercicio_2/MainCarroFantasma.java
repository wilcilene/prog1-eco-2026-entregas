package Exercicio_2;
public class MainCarroFantasma {
    public static void main(String[] args) {
        Carro carroNormal = new Carro();
        carroNormal.modelo = "Tucson";
        carroNormal.fantasma = false;

        Carro carroFantasma = new Carro();
        carroFantasma.modelo = "Fantasmagorico";
        carroFantasma.fantasma = true;

        System.out.println("Ligando o carro normal:");
        carroNormal.ligar();

        System.out.println("Ligando o carro fantasma:");
        carroFantasma.ligar();
    }
}