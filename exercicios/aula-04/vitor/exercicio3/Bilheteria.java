package exercicio3;

import java.util.Scanner;

public class Bilheteria {

    public static void main(String[] args) {
        int i;
        Scanner entrada = new Scanner(System.in);
        System.out.println("quantos ingresso voce quer digitar");
        i = entrada.nextInt();
        entrada.nextLine();
        String o;
        Ingresso ingresso[] = new Ingresso[i];
        for (int n = 0; n < i; n++) {
            ingresso[n] = new Ingresso();
            System.out.println("digite o nome do filme " + n + 1);
            ingresso[n].filme = entrada.nextLine();
            System.out.println("digite o horario do movie " + (n + 1));
            ingresso[n].horario = entrada.nextLine();
            System.out.println("meia entrada [s/n]");
            o = entrada.nextLine();
            if (o.equals("s")) {
                ingresso[n].meiaEntrada = true;
            } else {
                ingresso[n].meiaEntrada = false;
            }
        }
        for (int n = 0; n < i; n++) {
            System.out.println(
                "o filme" +
                    ingresso[n].filme +
                    "vai ser as " +
                    ingresso[n].horario
            );
            ingresso[n].finalPrice();
        }
    }
}
