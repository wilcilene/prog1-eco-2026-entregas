package exercicio4;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Camiseta newCamiseta = new Camiseta();
        System.out.println("digite a cor da camiseta:");
        newCamiseta.cor = entrada.nextLine();
        System.out.println("digite o tamanho:");
        newCamiseta.tamanho = entrada.nextLine();
        System.out.println("digite o preco");
        newCamiseta.preco = entrada.nextInt();
        if (newCamiseta.preco > 100) {
            System.out.println("essa camiseta premium");
        } else {
            System.out.println("camiseta padrao");
        }
    }
}
