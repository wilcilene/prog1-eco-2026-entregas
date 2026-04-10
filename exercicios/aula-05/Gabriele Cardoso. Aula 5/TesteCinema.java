import java.util.Scanner;

class IngressoCinema {
    String filme;
    String horario;
    boolean meiaEntrada;
    double valor;
}

public class TesteCinema {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;
        int qtdIngressos = 0;

        while (true) {
            System.out.print("Digite o nome do filme (Enter para finalizar): ");
            String nomeFilme = input.nextLine();

            if (nomeFilme.isEmpty()) {
                break;
            }

            IngressoCinema ticket = new IngressoCinema();
            ticket.filme = nomeFilme;

            System.out.print("Horário da sessão: ");
            ticket.horario = input.nextLine();

            System.out.print("É meia-entrada? (S/N): ");
            String opcao = input.nextLine();

            if (opcao.equalsIgnoreCase("S")) {
                ticket.meiaEntrada = true;
                ticket.valor = 15.0;
            } else if (opcao.equalsIgnoreCase("N")) {
                ticket.meiaEntrada = false;
                ticket.valor = 30.0;
            } else {
                System.out.println("Opção inválida! Considerando inteira.");
                ticket.valor = 30.0;
            }

            System.out.println(">> Ingresso: " + ticket.filme +
                    " | " + ticket.horario +
                    " | R$ " + String.format("%.2f", ticket.valor) + "\n");

            total += ticket.valor;
            qtdIngressos++;
        }

        System.out.println("=== Resumo do Cinema ===");
        System.out.println("Ingressos vendidos: " + qtdIngressos);
        System.out.println("Faturamento total: R$ " + String.format("%.2f", total));

        input.close();
    }
}