class VeiculoPlayer {
    String nomeModelo;
    int velAtual;
    int cargaTurbo;

    void ativarTurbo() {
        if (cargaTurbo <= 0) {
            System.out.println("Turbo indisponível!");
            return;
        }

        System.out.println(">>> TURBO LIGADO <<<");
        cargaTurbo -= 15;

        if (cargaTurbo < 0) {
            cargaTurbo = 0;
        }

        System.out.println("Carga restante: " + cargaTurbo);

        if (cargaTurbo == 0) {
            System.out.println("Turbo esgotado.");
        }
    }

    void exibirInfo() {
        System.out.println("Carro: " + nomeModelo);
        System.out.println("Velocidade atual: " + velAtual);
        System.out.println("Turbo inicial: " + cargaTurbo);
    }
}

public class MainVeiculo {
    public static void main(String[] args) {
        VeiculoPlayer v1 = new VeiculoPlayer();

        v1.nomeModelo = "Phantom X";
        v1.velAtual = 130;
        v1.cargaTurbo = 50;

        v1.exibirInfo();

        for (int i = 0; i < 4; i++) {
            v1.ativarTurbo();
        }
    }
}