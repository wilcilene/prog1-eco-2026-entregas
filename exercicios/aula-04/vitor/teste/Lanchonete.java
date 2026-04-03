package teste;

import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos pedidos deseja registrar? ");
        int n = entrada.nextInt();

        Pedido[] pedidos = new Pedido[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Pedido " + (i + 1) + " ---");
            pedidos[i] = new Pedido();

            System.out.println("1 - Hambúrguer (R$ 15.00)");
            System.out.println("2 - Pizza      (R$ 40.00)");
            System.out.println("3 - Suco       (R$  7.50)");
            System.out.print("Código do produto: ");
            pedidos[i].codigoProduto = entrada.nextInt();

            System.out.print("Quantidade: ");
            pedidos[i].quantidade = entrada.nextInt();

            double precoUnitario;

            switch (pedidos[i].codigoProduto) {
                case 1:
                    precoUnitario = 15.0;
                    break;
                case 2:
                    precoUnitario = 40.0;
                    break;
                case 3:
                    precoUnitario = 7.5;
                    break;
                default:
                    precoUnitario = 0.0;
                    System.out.println("Código inválido, valor será 0.");
            }

            pedidos[i].valorTotal = precoUnitario * pedidos[i].quantidade;
        }

        System.out.println("\n=== RESUMO DOS PEDIDOS ===");
        double somaTotal = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.println(
                "Pedido " +
                    (i + 1) +
                    " | código: " +
                    pedidos[i].codigoProduto +
                    " | qtd: " +
                    pedidos[i].quantidade +
                    " | total: R$ " +
                    pedidos[i].valorTotal
            );
            somaTotal += pedidos[i].valorTotal;
        }

        System.out.println("Valor total de todos os pedidos: R$ " + somaTotal);

        entrada.close();
    }
}
