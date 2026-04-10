import java.util.ArrayList;
import java.util.Scanner;

public class ListaMercado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        ArrayList<String> compras = new ArrayList<>();
        
        System.out.println("Minha Lista de Compras");
        System.out.println("Digite os produtos (ou 'sair' para finalizar):");

        while (true) {
            System.out.print("Item: ");
            String item = entrada.nextLine();

           
            if (item.equalsIgnoreCase("sair")) {
                break;
            }

            
            compras.add(item);
        }

        System.out.println("\nVocê tem " + compras.size() + " itens na lista:");
        
      
        for (String produto : compras) {
            System.out.println("- " + produto);
        }

        entrada.close();
    }
}