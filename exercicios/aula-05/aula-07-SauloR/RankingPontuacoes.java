class Jogador {
    String nome;
    int pontuacao;
}

public class RankingPontuacoes {

    public static void main(String[] args) {
        Jogador[] jogadores = new Jogador[3];

        jogadores[0] = new Jogador();
        jogadores[0].nome = "Victor";
        jogadores[0].pontuacao = 120;

        jogadores[1] = new Jogador();
        jogadores[1].nome = "Eduardo";
        jogadores[1].pontuacao = 200;

        jogadores[2] = new Jogador();
        jogadores[2].nome = "Felipe";
        jogadores[2].pontuacao = 180;

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
            
