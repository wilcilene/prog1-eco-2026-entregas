import java.util.Scanner; 

class IngressoCinema { 
    String filme;
    String horario; 
    boolean meiaEntrada;
    double valorpago;  
}

public class ProgramaIngressoCinema { 
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 

    double totalfaturado = 0.0 ; 
    int quantidadeingresso = 0; 

    while (true) {
        System.out.println("Nome do filme (enter para sair:"); 
        String filme = entrada.nextLine();

        if (filme.isEmpty()) {
            break; 
        }
        
        IngressoCinema ingresso = new IngressoCinema(); 
        ingresso.filme = filme; 

        System.out.println("Horário da sessão: "); 
        ingresso.horario = entrada.nextLine();

        System.out.println("Meia-entreda? (S/N) " ); 
        String resposta = entrada.nextLine(); 

        if (resposta.equalsIgnoreCase("S")) { 
            ingresso.meiaEntrada = true; 
            ingresso.valorpago = 15.0; 
        } else {
            ingresso.meiaEntrada = false; 
            ingresso.valorpago = 30.0; 
        }
        
        System.out.println("Ingresso registrado: "+ ingresso.filme
         + "às" + ingresso.horario + " valor -> R$ " + ingresso.valorpago); //barra n!!!!!
        

        totalfaturado += ingresso.valorpago; 
        quantidadeingresso++; 

}

    System.out.println("Total de ingressos vendidos: " + quantidadeingresso); 
    System.out.println("Faturamento total: R$ " + totalfaturado);

    entrada.close(); //fechar o teclado, NAO ESQUECE!!1
    }
}
  