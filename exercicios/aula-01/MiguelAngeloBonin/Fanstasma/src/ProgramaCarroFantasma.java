public class ProgramaCarroFantasma {
    public static void main(String[] args) {
        Carro carroNormal = new Carro();
        carroNormal.modelo = "Sedan Confort";
        carroNormal.fantasma = false;

        Carro carroFantasma = new Carro();
        carroFantasma.modelo = "King Buu";
        carroFantasma.fantasma = true;

        System.out.println("Ligando o carro:");
        carroNormal.ligar();

       System.out.println("Ligando o carro espectral:");
        carroFantasma.ligar();
    }
}
        