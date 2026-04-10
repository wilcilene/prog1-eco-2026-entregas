import java.util.Scanner;

class Cofrinho {
    String nomeDono;
    double saldo;
}

public class TesteCofrinho {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cofrinho meuCofrinho = new Cofrinho();

        System.out.print("Digite o nome do dono: ");
        meuCofrinho.nomeDono = input.nextLine();

        System.out.print("Digite o valor para guardar: ");
        double deposito = input.nextDouble();

        meuCofrinho.saldo = deposito;

        System.out.println("\n=== Situação do Cofrinho ===");
        System.out.println("O cofrinho de " + meuCofrinho.nomeDono
                + " possui R$ " + String.format("%.2f", meuCofrinho.saldo));

        input.close();
    }
}