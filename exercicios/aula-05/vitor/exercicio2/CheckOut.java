package exercicio2;

import exercicio2.Tarefas;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Tarefas> tarefas = new ArrayList<Tarefas>();
        int i = 0;
        do {
            System.out.println(
                "voce quer adicionar uma nova tarefa? aperte[s]"
            );
            if (entrada.nextLine().equals("s")) {
                System.out.println("digite o nome da tarefa");
                Tarefas newTarefas = new Tarefas();
                tarefas.add(newTarefas);
                newTarefas.tarefaName = entrada.nextLine();
                i++;
            } else {
                break;
            }
        } while (true);
    }
}
