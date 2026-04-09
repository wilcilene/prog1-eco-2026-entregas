package Exercicio_1;
import java.util.Scanner;

class Cofrinho {
    String nomeDono;
    double saldo;
}

public class MainCofrinho {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cofrinho cofre = new Cofrinho();

        System.out.print("Nome do cofrinho: ");
        cofre.nomeDono = entrada.nextLine();

        System.out.print("Quanto deseja guardar agora? ");
        double valor = entrada.nextDouble();
        cofre.saldo = valor;

        System.out.println("O cofrinho de" + cofre.nomeDono
                + " agora tem R$ " + cofre.saldo + " reais.");

        entrada.close();
    }
}