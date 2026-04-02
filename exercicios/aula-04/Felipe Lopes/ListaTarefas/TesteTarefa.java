package Listatarefas;
import java.util.Scanner;
public class TesteTarefa {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("quantas tarefas registrar");
	int n = entrada.nextInt();
	entrada.nextLine();
	
	Tarefa[] tarefas = new Tarefa[n];
	
	for (int i = 0; i< n; i++){
		tarefas[i] = new Tarefa();
		System.out.println(" Descrição da tarefa " + (i + 1) + ": ");
		tarefas [i].descricao = entrada.nextLine();
		tarefas [i].concluida = false;
	}
			
	int escolha;
	do {
		System.out.println("Digite o número da tarefa concluída (0 para sair): ");
		escolha = entrada.nextInt();
		
			if(escolha > 0 && escolha <= n ){
				tarefas[escolha - 1].concluida = true;
			} 
	}while (escolha != 0);
			
	System.out.println("\n=== Situação das tarefas ===");
	for (int i = 0; i < n; i++) {
	    String status = tarefas[i].concluida ? "ok" : "pendente";
	    System.out.println((i + 1) + " - " + tarefas[i].descricao + " [" + status + "]");
	}
			}
		
		
	}


