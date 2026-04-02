package AcademiaJava;
import java.util.Scanner;
public class TesteAcademia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("quantos estudantes serão cadastrados ");
		int n = entrada.nextInt();
		entrada.nextLine();
		
		EstudanteAcademia[] estudantes = new EstudanteAcademia[n];
		
		int fantasma = 0, iniciante = 0, focado = 0, atleta = 0;
		
		for (int i = 0; i < n; i++) {
			estudantes[i] = new EstudanteAcademia();
			
			System.out.println("nome do estudante" + (i + 1) + ": " );
			estudantes[i].nome = entrada.nextLine();
			
			System.out.println("Frequencia semanal");
			estudantes[i].frequenciaSemanal = entrada.nextInt();
			entrada.nextLine();
			
			int f = estudantes[i].frequenciaSemanal;
			
			if (f == 0) {
				fantasma++;
				System.out.println("Plano fantasma");
				
			}else if (f <= 2){
				iniciante++;
				System.out.println("modo iniciante");
				
				}else if (f <=4){
				focado++;
				System.out.println("modo focado");
				
				}else { 
					atleta++;
					System.out.println("modo atleta");
				
			}
			System.out.println();
		}
		 System.out.println("=== Resumo da Academia ===");
	        System.out.println("Plano fantasma: " + fantasma);
	        System.out.println("Modo iniciante: " + iniciante);
	        System.out.println("Modo focado: " + focado);
	        System.out.println("Modo atleta!: " + atleta);
		
		
		
		
	}
	
	
	

}
