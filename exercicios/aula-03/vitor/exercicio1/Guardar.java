package exercicio1;

import java.util.Scanner;

public class Guardar {

    public static void main(String[] args) {
        Cofrinho Money = new Cofrinho();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        Money.name = entrada.nextLine();
        System.out.println("digite o dinheiro a Guardar");
        Money.saldo = entrada.nextInt();
        System.out.println(
            "O cofrinho de " +
                Money.name +
                " agora tem " +
                Money.saldo +
                " reais"
        );
    }
}
