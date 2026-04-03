public class DadosdoEstudante {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.nome = "Rogerio Seni";
        estudante1.matricula = "2004003";
        Estudante estudante2 = new Estudante();
        estudante2.nome = "Carlos Alberto";
        estudante2.matricula = "2004004";
        System.out.println("Nome do primeiro estudante: " + estudante1.nome);
        System.out.println("Matricula do primeiro estudante: " + estudante1.matricula);
        System.out.println("Nome do segundo estudante: " + estudante2.nome);
        System.out.println("Matricula do segundo estudante: " + estudante2.matricula);
    }
}