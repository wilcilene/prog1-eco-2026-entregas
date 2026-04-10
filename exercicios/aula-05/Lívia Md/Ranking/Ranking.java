package Ranking;

public class Ranking{
    public static void main(String[] args){
        Jogador[] jogadores = new Jogador[5];
        jogadores[0] = new Jogador();
        jogadores[0].nome = "Leandrinha";
        jogadores[0].pontos = 90;
        jogadores[1] = new Jogador();
        jogadores[1].nome = "Maselo";
        jogadores[1].pontos = 50;
        jogadores[2] = new Jogador();
        jogadores[2].nome = "Roberto";
        jogadores[2].pontos = 47;
        jogadores[3] = new Jogador();
        jogadores[3].nome = "Fulano";
        jogadores[3].pontos = 12;
        jogadores[4] = new Jogador();
        jogadores[4].nome = "Jurandir";
        Jogador campeao = jogadores[0];
        for(int i = 1; i < jogadores.length; i++){
            if(jogadores[i].pontos > campeao.pontos){
                campeao = jogadores[i];
            }
        }
        System.out.println("O competidor " + campeao.nome + 
        " foi o campeao com " + campeao.pontos + " pontos");
    }
}