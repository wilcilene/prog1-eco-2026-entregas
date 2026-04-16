
import java.util.Scanner;


public class ProgramaSala {

    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        Sala atributos = new Sala();
        //Alterei o nome do objeto de "sala" para "atributo"
        System.out.println("Nome da sala: ");
        atributos.nome = entrada.nextLine();

        System.out.println("Temperatura na sala: ");
        atributos.temperatura = entrada.nextDouble();

        if (atributos.temperatura < 20){
            System.out.println("A sala está Fria");
        }else if (atributos.temperatura > 25){
            System.out.println("A sala está quente");
        }else {
            System.out.println("A sala está confortavel");
        }
        entrada.close();
    }
}