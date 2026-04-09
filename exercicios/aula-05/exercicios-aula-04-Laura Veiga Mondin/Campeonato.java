import java.util.Scanner;


class Jogador {
    String nome;
    int pontuacao;
}

public class Campeonato {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        Jogador[] jogadores = new Jogador[5];

        System.out.println(" Cadastro de Jogadores ");

       
        for (int i = 0; i < jogadores.length; i++) {
            
            jogadores[i] = new Jogador(); 
            
            System.out.print("Nome do jogador " + (i + 1) + ": ");
            jogadores[i].nome = entrada.nextLine();
            
            System.out.print("Pontuação de " + jogadores[i].nome + ": ");
            jogadores[i].pontuacao = entrada.nextInt();
            entrada.nextLine(); 
            System.out.println();
        }

        
        int indiceCampeao = 0; 

        for (int i = 1; i < jogadores.length; i++) {
            
            if (jogadores[i].pontuacao > jogadores[indiceCampeao].pontuacao) {
                indiceCampeao = i; 
            }
        }

        
        System.out.println(" O CAMPEÃO ");
        System.out.println("Nome: " + jogadores[indiceCampeao].nome);
        System.out.println("Pontuação: " + jogadores[indiceCampeao].pontuacao + " pontos");

        entrada.close();
    }
}