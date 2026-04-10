package exercsem5e6;
import java.util.Scanner;
public class Exerc1 {
	String nomeDono;
    double saldo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Exerc1 cofre = new Exerc1();

        System.out.print("Nome do dono do cofrinho: ");
        cofre.nomeDono = sc.nextLine();

        System.out.print("Quanto deseja guardar agora? ");
        double valor = sc.nextDouble();

        cofre.saldo = valor;

        System.out.println("O cofrinho de:" + cofre.nomeDono
                + " agora tem R$ " + cofre.saldo + " reais.");

        sc.close();
    }
}
