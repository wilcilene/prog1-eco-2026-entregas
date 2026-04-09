import java.util.Scanner;

public class ClassePrincipal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  
        System.out.printf("Digite seu nome: ");
        String nomeEstudante = entrada.nextLine();
        System.out.println("Olá estudante " + nomeEstudante + "!");

        entrada.close();   
    }
}