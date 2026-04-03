package exercicio2;

public class Tarefas {

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
