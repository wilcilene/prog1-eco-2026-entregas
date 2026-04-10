package CarroGamerEd;

public class ProgramaCarroJogador {
    public static void main(String[] args) {
        CarroJogador carro = new CarroJogador();
        carro.modelo = "Banana Split";
        carro.velocidade = 999;
        carro.nivelNitro = 8;

        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Velocidade: " + carro.velocidade);
        System.out.println("Nitro inicial: " + carro.nivelNitro);

        carro.usarNitro();
        carro.usarNitro();
        carro.usarNitro();
    }
}