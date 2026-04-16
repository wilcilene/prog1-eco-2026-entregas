import java.util.Scanner;

public class ProgramaRank {
    
    public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);

    Rank[] rank = new Rank[5];
    int maior = 0;
    int a = 0;

    for (int i = 0 ; i < 4 ; i++){

        rank[i] = new Rank();

        System.out.println("================" + (i+1) +"================");

        System.out.print("Coloque o nome do jogador: ");
        rank[i].nome = entrada.nextLine();

        System.out.print("Coloque a pontuação do " + (rank[i].nome) + ": ");
        rank[i].pontuacao = entrada.nextInt();
        entrada.nextLine();

        if (rank[i].pontuacao > maior){

            maior = rank[i].pontuacao;
            a = i;

        }
    }

    System.out.println("....................Record....................");
    System.out.println("Nome: " + (rank[a].nome));
    System.out.println("Pontuação: " + (rank[a].pontuacao));



    }
}
