public class CarroFantasma{
        public static void main(String[] args) {
            Carro carro = new Carro();
            carro.modelo = "gol quadrado";
            carro.ligado = true;
            Carro carrofantasma = new Carro();
            carrofantasma.modelo = "renault kwid";
            carrofantasma.fantasma = true;
            System.out.println("Ligando o carro:");
            carro.ligar();
            System.out.println("Ligando o carro fantasma:");
            carrofantasma.ligar();
        }
}