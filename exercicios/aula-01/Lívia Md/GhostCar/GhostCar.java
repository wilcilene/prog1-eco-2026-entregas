package GhostCar;

public class GhostCar {
    public static void main(String[] args) {
        Car carroNormal = new Car();
        carroNormal.modelo = "Sedan Confort";
        carroNormal.fantasma = false;

        Car carroFantasma = new Car();
        carroFantasma.modelo = "Cofre do diabo";
        carroFantasma.fantasma = true;

        System.out.println("Ligando o carro normal:");
        carroNormal.ligar();

        System.out.println("Ligando o carro fantasma:");
        carroFantasma.ligar();
    }
}