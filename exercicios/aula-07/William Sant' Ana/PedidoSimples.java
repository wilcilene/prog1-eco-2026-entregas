import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String nome;
    int qtd;
    double preco;

    double total() {
        return qtd * preco;
    }
}

public class PedidoSimples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Item> lista = new ArrayList<>();

        int op;

        do {
            System.out.println("\n1-Adicionar  2-Listar  3-Total  0-Sair");
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                Item i = new Item();

                System.out.print("Nome: ");
                i.nome = sc.nextLine();

                System.out.print("Qtd: ");
                i.qtd = sc.nextInt();

                System.out.print("Preço: ");
                i.preco = sc.nextDouble();
                sc.nextLine();

                lista.add(i);

            } else if (op == 2) {
                for (Item i : lista) {
                    System.out.println(i.nome + " - " + i.qtd + " = R$ " + i.total());
                }

            } else if (op == 3) {
                double soma = 0;
                for (Item i : lista) soma += i.total();
                System.out.println("Total: R$ " + soma);
            }

        } while (op != 0);

        sc.close();
    }
}