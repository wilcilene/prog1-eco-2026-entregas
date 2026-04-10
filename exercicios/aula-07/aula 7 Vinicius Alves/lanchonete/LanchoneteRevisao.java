import java.util.ArrayList;
import java.util.Scanner;
public class LanchoneteRevisao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<ItemPedido> itens = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n1 - Adicionar item");
            System.out.println("2 - Listar itens");
            System.out.println("3 - Ver total");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                ItemPedido item = new ItemPedido();

                System.out.print("Nome do item: ");
                item.nome = entrada.nextLine();

                System.out.print("Quantidade: ");
                item.quantidade = entrada.nextInt();

                System.out.print("Preço unitário: ");
                item.precoUnitario = entrada.nextDouble();
                entrada.nextLine();

                itens.add(item);
            } else if (opcao == 2) {
                System.out.println("\n=== Itens do pedido ===");
                for (int i = 0; i < itens.size(); i++) {
                    ItemPedido it = itens.get(i);
                    System.out.println((i + 1) + ". " + it.nome
                            + " - qtd: " + it.quantidade
                            + " - total: R$ " + it.calcularTotal());
                }
            } else if (opcao == 3) {
                double total = 0.0;
                for (ItemPedido it : itens) {
                    total += it.calcularTotal();
                }
                System.out.println("Total do pedido: R$ " + total);
            }

        } while (opcao != 0);

        entrada.close();
    }
}