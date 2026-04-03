import java.util.Scanner;
public class CinemajavaFlix{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double totalFaturado = 0.0;
        int quantidadeIngressos =0;
        while (true) { 
            System.out.print("Nome do filme(apenas enter para sair): ");
            String filme = entrada.nextLine();
            if(filme.isEmpty()){
                break;
            }
            IngressoCinema ingresso = new IngressoCinema();
            ingresso.filme = filme;
            System.out.print("Horario da sessao: ");
            ingresso.horario = entrada.nextLine();
            System.out.print("Meia-entrada?(S/N): ");
            String resposta = entrada.nextLine();
            if (resposta.equalsIgnoreCase("S")){
                ingresso.meiaEtrada = true;
                ingresso.valorPago = 15.0;
            }else{
                ingresso.meiaEtrada = false;
                ingresso.valorPago = 30.0;
            }
            System.out.println("Ingresso do filme: " + ingresso.filme + "as " 
            + ingresso.horario + " no valor de R$ " + ingresso.valorPago + "\n");
            totalFaturado += ingresso.valorPago;
            quantidadeIngressos++;
        }
        System.out.println("Valor total de ingressos vendidos: " +quantidadeIngressos);
        System.out.println("Faturamento: R$ " + totalFaturado);
    }
}