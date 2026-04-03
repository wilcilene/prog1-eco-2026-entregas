package exercicio1;

public class Tarefa {

    String tarefaName;
    String descricao;
    boolean status;

    void o() {
        if (status == true) {
            System.out.println("Concluida");
        } else {
            System.out.println("Pendente");
        }
    }
}
