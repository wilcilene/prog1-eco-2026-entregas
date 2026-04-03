public class CarroJogador {
    String modelo;
    int velocidade;
    int nivelNitro;

    void usarNitro() {
        if (nivelNitro > 0) {
            System.out.println("NITRO ATIVADO!");
            nivelNitro = nivelNitro - 20;
            System.out.println("Nivel de nitro agora: " + nivelNitro);
            if (nivelNitro <= 0) {
                System.out.println("O nitro acabou!");
            }
        } else {
            System.out.println("Sem nitro disponível.");
        }
    }
}