import java.util.Scanner;

class Item {
    String texto;
    boolean finalizado;

    String getStatus() {
        return finalizado ? "Concluído" : "Em aberto";
    }
}

public class GerenciadordeTarefas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de itens: ");
        int total = sc.nextInt();
        sc.nextLine();

        Item[] lista = new Item[total];

        for (int i = 0; i < total; i++) {
            lista[i] = new Item();
            System.out.print("Digite o item " + (i + 1) + ": ");
            lista[i].texto = sc.nextLine();
            lista[i].finalizado = false;
        }

        marcarItens(lista, sc);

        exibirLista(lista);

        sc.close();
    }

    static void marcarItens(Item[] lista, Scanner sc) {
        int opcao;

        while (true) {
            System.out.print("Marcar item (0 para encerrar): ");
            opcao = sc.nextInt();

            if (opcao == 0) {
                break;
            }

            if (opcao >= 1 && opcao <= lista.length) {
                lista[opcao - 1].finalizado = true;
            }
        }
    }

    static void exibirLista(Item[] lista) {
        System.out.println("\n--- Lista final ---");

        for (int i = 0; i < lista.length; i++) {
            System.out.println((i + 1) + " - " +
                    lista[i].texto + " [" + lista[i].getStatus() + "]");
        }
    }
}