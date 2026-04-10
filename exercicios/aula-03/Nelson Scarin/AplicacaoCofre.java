import java.util.Scanner;

class CaixaEconomica {
    String proprietario;
    double totalGuardado;

    void mostrarSaldo() {
        System.out.println("O cofre de " + proprietario +
                " possui R$ " + totalGuardado);
    }
}

public class AplicacaoCofre {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CaixaEconomica caixa = new CaixaEconomica();

        System.out.print("Informe o nome do proprietário: ");
        caixa.proprietario = sc.nextLine();

        System.out.print("Digite o valor para depósito: ");
        double deposito = sc.nextDouble();

        caixa.totalGuardado += deposito;

        caixa.mostrarSaldo();

        sc.close();
    }
}