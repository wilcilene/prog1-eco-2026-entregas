import java.util.Scanner;

class Bilhete {
    String tituloFilme;
    String horaSessao;
    boolean meia;
    double preco;

    void definirPreco(String opcao) {
        if (opcao.equalsIgnoreCase("S")) {
            meia = true;
            preco = 15.0;
        } else {
            meia = false;
            preco = 30.0;
        }
    }

    void mostrar() {
        System.out.println("Filme: " + tituloFilme +
                " | Sessão: " + horaSessao +
                " | Valor pago: R$ " + preco);
    }
}

public class SistemaCinema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0;
        int qtd = 0;

        while (true) {

            System.out.print("Digite o nome do filme (vazio para encerrar): ");
            String nome = sc.nextLine();

            if (nome.length() == 0) {
                break;
            }

            Bilhete b = new Bilhete();
            b.tituloFilme = nome;

            System.out.print("Informe o horário: ");
            b.horaSessao = sc.nextLine();

            System.out.print("É meia-entrada? (S/N): ");
            String op = sc.nextLine();

            b.definirPreco(op);

            b.mostrar();
            System.out.println();

            total += b.preco;
            qtd++;
        }

        System.out.println("Quantidade vendida: " + qtd);
        System.out.println("Total arrecadado: R$ " + total);

        sc.close();
    }
}