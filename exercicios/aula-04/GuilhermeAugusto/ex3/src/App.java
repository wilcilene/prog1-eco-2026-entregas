import java.util.Scanner;

class IngressoCinema{
    String filme;
    String horario;
    boolean meiaEntrada;

    public IngressoCinema(String filme, String horario, boolean meiaEntrada){
        this.filme = filme;
        this.horario = horario;
        this.meiaEntrada = meiaEntrada;
    }

    void verIngressos(int numIngresso){
        System.out.println("Ingresso: " + (numIngresso + 1));
        System.out.println("Nome do filme: " + filme);
        System.out.println("Horario: " + horario);
        System.out.println("Meia entrada: " + meiaEntrada + "\n\n");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        String nomeFilme;
        String horarioFilme;
        String meia;

        System.out.println("Quantos ingressos?");
        int numeroIngressos = obj.nextInt();
        obj.nextLine();
        IngressoCinema[] ingressos = new IngressoCinema[numeroIngressos];

        for(int i = 0; i < numeroIngressos; i++){
            System.out.println("Nome do filme:");
            nomeFilme = obj.nextLine();

            System.out.println("Horario:");
            horarioFilme = obj.nextLine();

            System.out.println("Tem meia entrada?[S/N]");
            meia = obj.nextLine();

            if(meia.equalsIgnoreCase("s")){
                ingressos[i] = new IngressoCinema(nomeFilme, horarioFilme, true);
            }
            else{
                ingressos[i] = new IngressoCinema(nomeFilme, horarioFilme, false);
            }
        }

        for(int i = 0; i < numeroIngressos; i++){
            ingressos[i].verIngressos(i);
        }
        obj.close();
    }
}
