package exercsem5e6;
import java.util.Scanner;
public class Exerc2 {
	 String nome;
	 double temperatura;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        Exerc2 sala = new Exerc2();

	        System.out.print("Nome da sala: ");
	        sala.nome = sc.nextLine();

	        System.out.print("Temperatura da sala: ");
	        sala.temperatura = sc.nextDouble();

	        System.out.println("Sala: " + sala.nome
	                + " | Temperatura: " + sala.temperatura + " ºC");

	        if (sala.temperatura < 20) {
	            System.out.println("Sala esta Fria");
	        } else if (sala.temperatura <= 25) {
	            System.out.println("Sala esta Confortável");
	        } else {
	            System.out.println("Sala esta Quente");
	        }

	        sc.close();
	    }
}
