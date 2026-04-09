package Exercicio_1;
public class CarroJogador {
    String modelo;
    int velocidade;
    int nivelNitro;
    void usarNitro() {
        if (nivelNitro > 0) {
            System.out.println("NITRO ATIVADO!");
            nivelNitro = nivelNitro - 20;
            System.out.println("Nitro Atual: " + nivelNitro);
            if (nivelNitro <= 0) {
                System.out.println("Reserva de Nitro Esgotada!");
            }
        } else {
            System.out.println("Sem nitro");
        }
    }
}