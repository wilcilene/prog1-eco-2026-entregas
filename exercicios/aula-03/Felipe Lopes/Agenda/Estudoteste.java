package Estudo;
import java.util.Scanner;
public class Estudoteste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		Estudo disciplina1 = new Estudo();
		
		System.out.println("digite a disciplina");
		disciplina1.disciplina = entrada.nextLine();
		
		
		System.out.println("quantidade de minutos estudado");
		disciplina1.minutos =  entrada.nextDouble();
		
		if(disciplina1.minutos <30){
			System.out.println("bom começo");
		}
		else if (disciplina1.minutos <60) {
			System.out.println("boa dedicação");
			
		}
		else {
			System.out.println("modo focado ativado");
		}
	
	
	
	
	
	
	
	
	}

}
