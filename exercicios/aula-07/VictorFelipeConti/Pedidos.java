import java.util.ArrayList;
import java.util.Scanner;

public class Pedidos {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<ItemPedido> itens = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do { 
            exibirMenu();
            opcao = lerInt("Opção: ");

            switch(opcao) {
                case 1 -> cadastrarItem();
                case 2 -> listarItens();   
                case 3 -> verTotal();
                case 0 -> System.out.println("\nPedido encerrado. Até logo!");
                default -> System.out.println("Opção inválida. Tente novamente.\n");         
            }
            
        } while (opcao != 0);

        scanner.close();
    }
    
    // Menu
    private static void exibirMenu() {
        System.out.println("========================");
        System.out.println("     MENU DO PEDIDO     ");
        System.out.println("========================");
        System.out.println("   1 - Cadastrar item   ");
        System.out.println("   2 - Listar itens     ");
        System.out.println("   3 - Ver total        ");
        System.out.println("   0 - Sair             ");
    }

    //Opção 1
    private static void cadastrarItem() {
        System.out.println("\n--- Cadastrar Item ---");

        System.out.println("Nome do item: ");
        scanner.nextLine();        // limpa o buffer após nextInt anterior
        String nome = scanner.nextLine().trim();

        if(nome.isEmpty()) {
            System.out.println("Nome não pode ser vazio.\n");
            return;
        }
        int quantidade;
        do { 
            quantidade = lerInt("Quantidade: ");
            if (quantidade <= 0) System.out.println("Quantidade deve ser maior que zero.");
        } while (quantidade <= 0);

        double preco;
        do { 
            preco = lerDouble("Preço unitário (R$): ");
            if (preco < 0 ) System.out.println("Preço não pode ser negativo.");
        } while (preco < 0);

        itens.add(new ItemPedido(nome, quantidade, preco));
        System.out.printf("Item \"%s\" adicionado com sucesso!%n%n", nome);
    }

    //Opção 2
    private static void listarItens() {
        System.out.println("\n--- Itens do Pedido ---");

        if(itens.isEmpty()) {
            System.out.println("Nenhum item cadastro.\n");
            return;
        }

        System.out.println("-".repeat(65));
        for (int i = 0; i < itens.size(); i++) {
            System.out.println("[%d] %s%n", i + 1, itens.get(i));
        }
        System.out.println("-".repeat(65));
        System.out.println();
    }

    //Opção 3
    private static void verTotal() {
        System.out.println("\n--- Total do Pedido ---");

        if(itens.isEmpty()) {
            System.out.println("Nenhum item cadastrado.\n");
        return;
        }

        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }

        System.out.println("Itens no pedido : %d%n", itens.size());
        System.out.println("TOTAL         : R$ %.2f%n%n", total);
    }

    // Ajuda na leitura
    private static int lerInt(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                int valor = Integer.parseInt(scanner.nextLine().trim());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    private static double lerDouble(String mensagem) {
        while (true) { 
            System.out.print(mensagem);
            try {
                // aceita tanto ponto quanto vírgula como separador decimal
                String entrada = scanner.nextLine().trim().replace(",", ".");
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.")
            }
        }
    }
}
