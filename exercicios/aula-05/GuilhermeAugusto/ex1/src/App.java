import java.util.Scanner;

class Jogador{
    String nome;
    int pontuacao;

    public Jogador(String nome, int pontuacao){
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    void exibirPontucao(){
        System.out.println("JOGADOR: " + nome);
        System.out.println("PONTUACAO: " + pontuacao + "\n");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        String nomeJogador = "";
        int pontuacaoJogador;
        int maior;

        Jogador[] jogadores = new Jogador[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Nome do jogador:");
            nomeJogador = obj.nextLine();

            System.out.println("Pontuacao: ");
            pontuacaoJogador = obj.nextInt();
            obj.nextLine();

            jogadores[i] = new Jogador(nomeJogador, pontuacaoJogador);
        }

        maior = jogadores[0].pontuacao;

        for(int i = 0; i < 5; i++){
            jogadores[i].exibirPontucao();

            if(jogadores[i].pontuacao > maior){
                maior = jogadores[i].pontuacao;
                nomeJogador = jogadores[i].nome;
            }
        }

        System.out.println(nomeJogador + " foi o campeao com " + maior + " pontos!");

        obj.close();
    }
}
