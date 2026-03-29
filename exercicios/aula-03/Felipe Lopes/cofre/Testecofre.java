package Cofredigital;

import java.util.Scanner;


public class Testecofre {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Cofredigital cofre = new Cofredigital();
		
		System.out.println("Nome do dono do cofre" );
		cofre.nomeDono = entrada.nextLine();
		
		System.out.println("quanto guardar ");
		double valor = entrada.nextDouble();
		
		cofre.saldo = valor;
		
		
		System.out.println(" o Cofredigital de " + cofre.nomeDono + " agora tem R$ " + cofre.saldo + " reais.");
		
		entrada.close ();
		
		
		
		

	}

}
