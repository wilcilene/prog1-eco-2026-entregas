public class Estudante {
    String nome;
    String matricula;
}

public class TesteEstudante {
    public static void main(String[] args) {

        Estudante aluno = new Estudante();

        aluno.nome = "Carlos Souza";
        aluno.matricula = "2026123";

        System.out.println("=== Dados do Aluno ===");
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.matricula);
    }
}