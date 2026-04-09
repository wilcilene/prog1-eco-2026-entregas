package Exercicio_2;

import java.util.ArrayList;
import java.util.Scanner;

class Tarefa {
    String descricao;
    boolean concluida;
}

public class MainRefeitoTarefa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Tarefa> tarefas = new ArrayList<>();

        System.out.print("Quantas tarefas deseja registrar? ");
        int n = entrada.nextInt();
        entrada.nextLine();

        // Cadastro das tarefas
        for (int i = 0; i < n; i++) {
            Tarefa t = new Tarefa();
            System.out.print("Descrição da tarefa " + (i + 1) + ": ");
            t.descricao = entrada.nextLine();
            t.concluida = false;

            tarefas.add(t);
        }

        int escolha;
        do {
            System.out.print("Digite o número da tarefa concluída (Digite 0 para sair): ");
            escolha = entrada.nextInt();

            if (escolha > 0 && escolha <= tarefas.size()) {
                tarefas.get(escolha - 1).concluida = true;
            }

        } while (escolha != 0);

        System.out.println("\n");

        // Exibir tarefas
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa t = tarefas.get(i);
            String status = t.concluida ? "OK" : "Pendente";
            System.out.println((i + 1) + ". " + t.descricao + " [" + status + "]");
        }

        entrada.close();
    }
}
