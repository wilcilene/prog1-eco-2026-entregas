import java.util.Scanner;

class Tarefa{
    String descricao;
    boolean concluida;

    public Tarefa(String descricao, boolean concluida){
        this.descricao = descricao;
        this.concluida = concluida;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        String desc = "";
        boolean rodando = true;

        System.out.println("Quantas tarefas quer registrar:");
        int n = obj.nextInt();
        Tarefa[] tarefas = new Tarefa[n]; 

        for(int i = 0; i < n; i++){
            System.out.println("Descricao da tarefa:");
            desc = obj.next();

            tarefas[i] = new Tarefa(desc, false);
        }

        while (rodando) {
            System.out.println("Numero da tarefa concluida[0 para encerrar]: ");
            int numeroTarefa = obj.nextInt();

            if (numeroTarefa < 0 || numeroTarefa > n) {
                System.out.println("Numero da tarefa invalido.\n");
            }
            else{
                tarefas[numeroTarefa].concluida = true;
                System.out.println("Tarefa " + numeroTarefa + " concluida!");
            }

            if (numeroTarefa == 0) {
                rodando = false;
            }
        }
        obj.close();
    }
}
