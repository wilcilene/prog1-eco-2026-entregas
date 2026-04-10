public class ProgramaEstudante {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();

        estudante1.nome = "Vinicius Alves";
        estudante1.matricula = "2023000551";

        System.out.println("Nome do estudante: " + estudante1.nome);
        System.out.println("Matrícula: " + estudante1.matricula);
    }
}