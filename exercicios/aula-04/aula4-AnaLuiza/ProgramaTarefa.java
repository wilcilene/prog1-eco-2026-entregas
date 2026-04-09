import java.util.Scanner; 

class Tarefa {
    String descricao; 
    boolean concluida; 
}

public class ProgramaTarefa { 
    public static void main(String[] agrs) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Quantas tarefas quer registrar?"); 
    int n = entrada.nextInt();
    entrada.nextLine();  

    Tarefa[] tarefa = new Tarefa[n]; 

    for (int i = 0; i < n; i++) {
        tarefa[i] = new Tarefa(); 
        System.out.println("Descrição da tarefa " + (i+1) + ": "); 
        tarefa[i].descricao = entrada.nextLine(); 
        tarefa[i].concluida = false; 
    }

    int escolha; 
    do { 
        System.out.println("Digite o número de tarefas concluídas (0 para sair): "); 
        escolha = entrada.nextInt(); 
        entrada.nextLine(); 

            if (escolha > 0 && escolha <=n) {
                tarefa[escolha - 1].concluida = true; 
            }
        } while (escolha != 0); 
            System.out.println("\n - Situação das tarefas -"); 
           for (int i = 0; i < n; i++) {
            String status = tarefa[i].concluida ? "OK" : "Pendente"; 
            System.out.println((i+1) + ". " + tarefa[i].descricao + "[" + status + "]");
           } 
        entrada.close();     
    }
}