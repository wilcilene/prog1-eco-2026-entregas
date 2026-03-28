public class ProgramaEstudante {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();

        estudante1.nome = "Vladimir Lenin";
        estudante1.matricula = "1917000";

        System.out.println("Nome do estudante: " + estudante1.nome);
        System.out.println("ID: " + estudante1.matricula);
    }
}
        