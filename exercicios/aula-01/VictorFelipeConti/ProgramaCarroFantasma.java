public class ProgramaCarroFantasma {
    public static void main(String[] args) {
        Car carroNormal = new Car();
        carroNormal.modelo = "Ferrari 488";
        carroNormal.fantasma = false;

        Car carroFantasma = new Car();
        carroFantasma.modelo = "Bugatti Chiron";
        carroFantasma.fantasma = true;

        System.out.println("Ligando o carro normal.");
        carroNormal.ligar();

        System.out.print("Ligando o carro fantasma.");
        carroFantasma.ligar();

        }
}
