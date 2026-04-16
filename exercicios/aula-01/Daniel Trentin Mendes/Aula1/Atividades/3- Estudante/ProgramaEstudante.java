public class ProgramaEstudante {
    
    public static void main(String[] args){

        Estudante novoEstudante = new Estudante();

        novoEstudante.nome = "Jorel";
        novoEstudante.matricula = "Matricula";

        System.out.println("Nome do estudante: " + novoEstudante.nome);
        System.out.println("Matricula do estudante: " + novoEstudante.matricula);

    }
}
