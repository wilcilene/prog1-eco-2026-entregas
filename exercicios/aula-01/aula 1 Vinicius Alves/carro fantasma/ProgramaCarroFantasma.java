public class ProgramaCarroFantasma {
    public static void main(String[] args) {
        Carro carroNormal = new Carro();
        carroNormal.modelo = "Sedan Confort";
        carroNormal.fantasma = false;

        Carro carroFantasma = new Carro();
        carroFantasma.modelo = "Phantom Runner";
        carroFantasma.fantasma = true;

        System.out.println("Ligando o carro normal:");
        carroNormal.ligar();

        System.out.println("Ligando o carro fantasma:");
        carroFantasma.ligar();
    }
}