package Exercicio_1;
public class MainCarroJogador {
    public static void main(String[] args) {
        CarroJogador carro = new CarroJogador();
        carro.velocidade = 120;
        carro.modelo = "Citroen Survolt";
        carro.nivelNitro = 100;
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Velocidade: " + carro.velocidade);
        System.out.println("Nitro inicial: " + carro.nivelNitro);
        carro.usarNitro();
        carro.usarNitro();
        carro.usarNitro();
        carro.usarNitro();
        carro.usarNitro();
    }
}