class Jogador {
    String nome;
    int pontuacao;
}

public class TesteRanking {

    public static void main(String[] args) {

        Jogador[] lista = new Jogador[5];

        lista[0] = new Jogador();
        lista[0].nome = "Ana";
        lista[0].pontuacao = 150;

        lista[1] = new Jogador();
        lista[1].nome = "Bruno";
        lista[1].pontuacao = 220;

        lista[2] = new Jogador();
        lista[2].nome = "Carlos";
        lista[2].pontuacao = 180;

        lista[3] = new Jogador();
        lista[3].nome = "Diana";
        lista[3].pontuacao = 260;

        lista[4] = new Jogador();
        lista[4].nome = "Lucas";
        lista[4].pontuacao = 200;

        Jogador melhor = lista[0];

        for (int i = 1; i < lista.length; i++) {
            if (lista[i].pontuacao > melhor.pontuacao) {
                melhor = lista[i];
            }
        }

        System.out.println("🏆 Campeão: " + melhor.nome +
                " com " + melhor.pontuacao + " pontos!");
    }
}