import java.util.Scanner;

    public class OlaEstudante{

        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite seu nome: ");
            String nomeEstudante = entrada.nextLine();

            System.out.println("Olá " + nomeEstudante + "!");

            entrada.close();
        }

    }