package CarroGamerEd;

public class CarroJogador {
    String modelo;
    int velocidade;
    int nivelNitro;

    void usarNitro() {
        if (nivelNitro > 0) {
            System.out.println("Nitro ligado");
            nivelNitro = nivelNitro -= 4;
            System.out.println("Nivel de nitro agora: " + nivelNitro);
            if (nivelNitro <= 0) {
                System.out.println("Acabou!");
            }
        } else {
            System.out.println("Tigrinho nn ta pagando, sem nitro disponível.");
        }
    }
}