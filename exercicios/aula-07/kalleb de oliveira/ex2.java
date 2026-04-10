import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale; // Necessário para tratar o ponto decimal

class ProdutoSelecionado {
    String nomeProduto;
    int qtd;
    double valorCada;

    double calcularSubtotal() {
        return qtd * valorCada;
    }
}

public class LanchoneteRevisao {

    public static void main(String[] args) {
        // .useLocale(Locale.US) garante que o sistema aceite pontos (5.50) em vez de vírgulas
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        ArrayList<ProdutoSelecionado> listaPedidos = new ArrayList<>();

        int selecao;
        
        do {
            System.out.println("\n--- SISTEMA DE PEDIDOS ---");
            System.out.println("1. Adicionar Item");
            System.out.println("2. Listar Itens");
            System.out.println("3. Calcular Total");
            System.out.println("0. Encerrar");
            System.out.print("Digite a opção: ");
            
            selecao = teclado.nextInt();
            teclado.nextLine(); // Limpeza de buffer obrigatória após nextInt

            switch (selecao) {
                case 1:
                    ProdutoSelecionado novoItem = new ProdutoSelecionado();

                    System.out.print("Nome do produto: ");
                    novoItem.nomeProduto = teclado.nextLine();

                    System.out.print("Quantidade: ");
                    novoItem.qtd = teclado.nextInt();

                    System.out.print("Preço unitário: ");
                    novoItem.valorCada = teclado.nextDouble();
                    teclado.nextLine(); // Limpeza de buffer após nextDouble

                    listaPedidos.add(novoItem);
                    System.out.println("Item registrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- LISTAGEM ATUAL ---");
                    for (int i = 0; i < listaPedidos.size(); i++) {
                        ProdutoSelecionado p = listaPedidos.get(i);
                        System.out.printf("%d. %s | Qtd: %d | Subtotal: R$ %.2f%n", 
                                          (i + 1), p.nomeProduto, p.qtd, p.calcularSubtotal());
                    }
                    break;

                case 3:
                    double valorFinal = 0.0;
                    for (ProdutoSelecionado p : listaPedidos) {
                        valorFinal += p.calcularSubtotal();
                    }
                    System.out.printf("VALOR TOTAL DO PEDIDO: R$ %.2f%n", valorFinal);
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (selecao != 0);

        teclado.close();
    }
}