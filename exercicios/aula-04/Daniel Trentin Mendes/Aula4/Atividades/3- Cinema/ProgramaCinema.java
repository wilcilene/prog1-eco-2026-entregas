import java.util.Scanner;

public class ProgramaCinema {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double valorFaturado = 0.0;
        int quantidadeIngresso = 0;

        Cinema ingresso = new Cinema();

        while(true){

            System.out.print("Digite o nome do filme desejado (Enter para sair): ");
            String nomeF = entrada.nextLine();

            if (nomeF.isEmpty()){
                break;
            }else{
                ingresso.filme = nomeF;
            }

            System.out.print("Digite o horario do filme (ex: 19:30): ");
            ingresso.horario = entrada.nextLine();

            System.out.print("Possui meia entrada? (S/N): ");
            String meia = entrada.nextLine();

            if (meia.equalsIgnoreCase("S")) {
                    ingresso.meiaEntrada = true;
                    ingresso.valorPago = 15.0;
                    ingresso.meiaEntrada = true;
                } else {
                    ingresso.meiaEntrada = false;
                    ingresso.valorPago = 30.0;
                    ingresso.meiaEntrada = false;
                }

            System.out.println(".......................................................");
            System.out.println("Nome do filme: " + ingresso.filme);
            System.out.println("Horario do filme: " + ingresso.horario);
            System.out.println("Valor: " + ingresso.valorPago);

            valorFaturado += ingresso.valorPago;
            quantidadeIngresso ++;

        }

        System.out.println("Total de ingressos vendidos: " + quantidadeIngresso);
        System.out.println("Faturamento total: " + valorFaturado);

        entrada.close();
    }
}
