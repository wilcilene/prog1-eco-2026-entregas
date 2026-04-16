import java.util.Scanner;

public class ProgramaCofrinho {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        Cofrinho dados = new Cofrinho();

        System.out.println("Nome do dono: ");
        dados.nomeDono = entrada.nextLine();

        System.out.println("Saldo na conta: ");
        dados.saldo = entrada.nextDouble();
    
        System.out.println("O cofrinho de " + dados.nomeDono + " agora tem " + dados.saldo + " reais.");

        entrada.close();
    }

}