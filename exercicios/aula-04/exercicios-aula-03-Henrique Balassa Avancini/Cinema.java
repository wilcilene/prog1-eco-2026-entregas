import java.util.Scanner;
    
    class IngressoCinema {
        String filme;
        String horario;
        boolean meiaEntrada;
        double valorPago;
    }
    
    public class Cinema {
    
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
    
            double totalFaturado = 0.0;
            int quantidadeIngressos = 0;
    
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
    
                System.out.print("Meia-entrada? ");
                String resposta = entrada.nextLine();
    
                if (resposta.equalsIgnoreCase("S")) {
                    ingresso.meiaEntrada = true;
                    ingresso.valorPago = 15.0;
                } else {
                    ingresso.meiaEntrada = false;
                    ingresso.valorPago = 30.0;
                }
    
                System.out.println("Ingresso registrado: " + ingresso.filme
                        + " às " + ingresso.horario
                        + " | valor: R$ " + ingresso.valorPago + "\n");
    
                totalFaturado += ingresso.valorPago;
                quantidadeIngressos++;
            }
    
            System.out.println("Total de ingressos vendidos: " + quantidadeIngressos);
            System.out.println("Faturamento total: R$ " + totalFaturado);
    
            entrada.close();
        }
    }
                
