package Exercicio_1;
class Jogador {
    String nome;
    int pontuacao;
}
public class MainJogador {
    public static void main(String[] args) {
        Jogador[] jogadores = new Jogador[3];

        jogadores[0] = new Jogador();
        jogadores[0].nome = "Pablo";
        jogadores[0].pontuacao = 300;

        jogadores[1] = new Jogador();
        jogadores[1].nome = "Evandro";
        jogadores[1].pontuacao = 500;

        jogadores[2] = new Jogador();
        jogadores[2].nome = "FAna";
        jogadores[2].pontuacao = 550;

        Jogador campeao = jogadores[0];

        for (int i = 1; i < jogadores.length; i++) {
            if (jogadores[i].pontuacao > campeao.pontuacao) {
                campeao = jogadores[i];
            }
        }

        System.out.println("Campeão: " + campeao.nome
                + " com " + campeao.pontuacao + " pontos.");
    }
}
