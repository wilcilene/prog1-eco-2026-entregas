public class CarroJogador {
    String modelo;
    int velocidade;
    int nivelNitro; // 0 a 100

    void usarNitro() {
        if (nivelNitro > 0) {
            System.out.println(">> Nitro ativado! Aumentando velocidade...");

            nivelNitro -= 20;

            if (nivelNitro < 0) {
                nivelNitro = 0;
            }

            System.out.println("Nitro restante: " + nivelNitro);

            if (nivelNitro == 0) {
                System.out.println(">> O nitro esgotou!");
            }
        } else {
            System.out.println(">> Não há nitro disponível.");
        }
    }
}

public class TesteCarro {
    public static void main(String[] args) {
        CarroJogador meuCarro = new CarroJogador();

        meuCarro.modelo = "Turbo X";
        meuCarro.velocidade = 150;
        meuCarro.nivelNitro = 50;

        System.out.println("Carro: " + meuCarro.modelo);
        System.out.println("Velocidade atual: " + meuCarro.velocidade);
        System.out.println("Nitro inicial: " + meuCarro.nivelNitro);

        meuCarro.usarNitro();
        meuCarro.usarNitro();
        meuCarro.usarNitro();
    }
}