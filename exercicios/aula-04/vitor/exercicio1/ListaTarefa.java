package exercicio1;

import java.util.Scanner;

public class ListaTarefa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite quantas tarefas voce quer registar hoje:");
        int n = entrada.nextInt();
        entrada.nextLine();
        Tarefa[] tarefa = new Tarefa[n];
        for (int i = 0; i < n; i++) {
            tarefa[i] = new Tarefa();
            System.out.println("digite qual e a tarefa [" + (i + 1) + "]");
            tarefa[i].tarefaName = entrada.nextLine();
            System.out.println("digite a descricao da tarefa");
            tarefa[i].descricao = entrada.nextLine();

            int x = 1;
            while (x != 0) {
                System.out.println("---STATUS DA TAREFA---");
                System.out.println("[1]CONCLUIDA");
                System.out.println("[2]PENDENTE");
                int a = entrada.nextInt();
                entrada.nextLine();
                if (a == 1) {
                    tarefa[i].status = true;
                    x = 0;
                } else if (a == 2) {
                    tarefa[i].status = false;
                    x = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(tarefa[i].tarefaName);
            System.out.println("Status:");
            tarefa[i].o();
        }
        entrada.close();
    }
}
