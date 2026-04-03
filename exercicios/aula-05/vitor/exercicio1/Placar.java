package exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Placar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Jogador[] jogador = new Jogador[5];
        String n;
        for (int i = 0; i < jogador.length; i++) {
            jogador[i] = new Jogador();
            System.out.println("Digite o nome do jogador[" + (i + 1) + "]");
            jogador[i].nome = entrada.nextLine();
            System.out.println(
                "Digite a pontuacao do jogador[" + (i + 1) + "]"
            );
            jogador[i].pontuacao = entrada.nextInt();
        }
        for (int i = 0; i < jogador.length - 1; i++) {
            if (jogador[i].pontuacao > jogador[i + 1].pontuacao) {
                n = jogador[i].nome;
            } else {
                n = jogador[i + 1].nome;
            }
        }
        System.out.println("o jogador com mais pontos e: " + n + "o");
    }
}
