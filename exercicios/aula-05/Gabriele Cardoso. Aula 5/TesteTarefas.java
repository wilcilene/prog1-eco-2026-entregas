import java.util.Scanner;

class Tarefa {
    String descricao;
    boolean concluida;
}

public class TesteTarefas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas tarefas você deseja cadastrar? ");
        int quantidade = input.nextInt();
        input.nextLine(); // limpar buffer

        Tarefa[] lista = new Tarefa[quantidade];

        // Cadastro das tarefas
        for (int i = 0; i < quantidade; i++) {
            lista[i] = new Tarefa();

            System.out.print("Digite a tarefa " + (i + 1) + ": ");
            lista[i].descricao = input.nextLine();
            lista[i].concluida = false;
        }

        // Marcar como concluídas
        int opcao;
        do {
            System.out.print("Informe o número da tarefa concluída (0 para encerrar): ");
            opcao = input.nextInt();

            if (opcao > 0 && opcao <= quantidade) {
                lista[opcao - 1].concluida = true;
                System.out.println("Tarefa marcada como concluída!");
            } else if (opcao != 0) {
                System.out.println("Número inválido!");
            }

        } while (opcao != 0);

        // Exibir resultado
        System.out.println("\n=== Lista Final ===");
        for (int i = 0; i < quantidade; i++) {
            String situacao = lista[i].concluida ? "OK" : "Pendente";
            System.out.println((i + 1) + " - " + lista[i].descricao + " [" + situacao + "]");
        }

        input.close();
    }
}