public class ProgramaCarroJogador {
    public static void main(String[] args) {
        CarroJogador carro = new CarroJogador();
        carro.modelo = "787b";
        carro.velocidade = 200;
        carro.nivelNitro = 70;

        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Velocidade: " + carro.velocidade);
        System.out.println("Nitro inicial: " + carro.nivelNitro);

        carro.usarNitro();
        carro.usarNitro();
        carro.usarNitro();
        carro.usarNitro();
        carro.usarNitro();
        carro.usarNitro();
        carro.usarNitro();
        carro.usarNitro();
    }
}