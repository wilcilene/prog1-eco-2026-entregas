class Estudante {
    String nome;
    String matricula;
}

public class estudantes {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();

        estudante1.nome = "Saulo Resende";
        estudante1.matricula = "2025009153";

        System.out.println("Nome do estudante: " + estudante1.nome);
        System.out.println("Matrícula: " + estudante1.matricula);
    }
}