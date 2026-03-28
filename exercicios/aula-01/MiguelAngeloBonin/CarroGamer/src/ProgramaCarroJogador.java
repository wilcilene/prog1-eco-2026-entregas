
public class ProgramaCarroJogador {
    public static void main(String[] args) {
        CarroJogador carro = new CarroJogador();
        carro.modelo = "Supra MK4";
        carro.velocidade = 180;
        carro.nivelNitro = 6;

        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Velocidade: " + carro.velocidade);
        System.out.println("Nitro inicial: " + carro.nivelNitro);

        carro.usarNitro();
        carro.usarNitro();
        carro.usarNitro();
    }
}