import java.util.ArrayList;
import java.util.Scanner;

class ItemPedido{
    String nome;
    int quantidade;
    double precoUnitario;

    public ItemPedido(String nome, int quantidade, double precoUnitario){
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<ItemPedido> pedidos = new ArrayList<ItemPedido>();
        Scanner obj = new Scanner(System.in);
        boolean rodando = true;
        int opc;
        String nomeNovoItem;
        int qtdNovoItem;
        double precoNovoItem;
        double somaPrecos = 0.0;

        while (rodando) {
            System.out.println("--MENU ITENS--");
            System.out.println("[1] Cadastrar item");
            System.out.println("[2] Listar itens");
            System.out.println("[3] Ver total do pedido");
            System.out.println("[4] Sair");
            System.out.println("Opcao:");
            opc = obj.nextInt();
            obj.nextLine();
            
            switch (opc) {
                case 1:
                    System.out.println("\n\n-Cadastrando novo item-");
                    System.out.println("Nome:");
                    nomeNovoItem = obj.nextLine();

                    System.out.println("Quantidade:");
                    qtdNovoItem = obj.nextInt();
                    obj.nextLine();

                    System.out.println("Preco unitario:");
                    precoNovoItem = obj.nextDouble();
                    obj.nextLine();

                    pedidos.add(new ItemPedido(nomeNovoItem, qtdNovoItem, precoNovoItem));
                    System.out.println("Item " + nomeNovoItem + " cadastrado!");

                    break;                
                case 2:
                    System.out.println("\n\n\n\n\nLista dos itens cadastrados:");
                    for(ItemPedido p : pedidos) {
                        System.out.println(p.nome + " - R$" + p.precoUnitario);
                    }

                    System.out.println("Digite qualquer coisa para continuar... \n\n\n");
                    obj.next();
                    break;
                
                case 3:
                    System.out.println("\n\n\n\n\nItens: ");
                    System.out.println("-----------------------------------------");
                    for (ItemPedido p : pedidos) {
                        somaPrecos += (p.precoUnitario * p.quantidade);
                        System.out.println(p.nome + " | Quantidade: " + p.quantidade + " | Preco unitario: " + p.precoUnitario);
                    }
                    System.out.println("Total do pedido: R$" + somaPrecos);
                    System.out.println("-----------------------------------------");

                    System.out.println("Digite qualquer coisa para continuar... \n\n");
                    obj.next();
                    break;
                case 4:
                    System.out.println("Menu encerrado.");
                    rodando = false;

                    break;
            
                default:
                    break;
            }
        }

        obj.close();
    }
}
