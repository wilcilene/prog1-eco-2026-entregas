import java.util.ArrayList;
import java.util.Scanner; 
class IngressoCinema {
    String filme;
    String horario;
    boolean meiaEntrada;
    double valorPago;
}

public class CinemaArray {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        ArrayList<IngressoCinema> listaDeIngressos = new ArrayList<>();

        while (true) {
            System.out.print("Nome do filme: ");
            String filme = entrada.nextLine();

            if (filme.isEmpty()) {
                break;
            }

            IngressoCinema ingresso = new IngressoCinema();
            ingresso.filme = filme;

            System.out.print("Horário da sessão: ");
            ingresso.horario = entrada.nextLine();

            System.out.print("Meia-entrada? (S/N): ");
            String resposta = entrada.nextLine();

            if (resposta.equalsIgnoreCase("S")) {
                ingresso.meiaEntrada = true;
                ingresso.valorPago = 15.0;
            } else {
                ingresso.meiaEntrada = false;
                ingresso.valorPago = 30.0;
            }

          
            listaDeIngressos.add(ingresso);
            System.out.println("Ingresso adicionado à lista!\n");
        }

        
        System.out.println(" RELATÓRIO DE VENDAS ");
        double totalFaturado = 0.0;

        for (IngressoCinema i : listaDeIngressos) {
            String tipo = i.meiaEntrada ? "(Meia)" : "(Inteira)";
            System.out.println("Filme: " + i.filme + " | Horário: " + i.horario + " | " + tipo + " - R$ " + i.valorPago);
            totalFaturado += i.valorPago;
        }

        System.out.println("\nTotal de ingressos vendidos: " + listaDeIngressos.size()); 
        System.out.println("Faturamento total: R$ " + totalFaturado);

        entrada.close();
    }
}
