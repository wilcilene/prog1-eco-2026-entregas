package Exercicio_3;
public class MainEstudante {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();

        estudante1.nome = "cesar";
        estudante1.matricula = "2022000870";

        System.out.println("Nome do estudante: " + estudante1.nome);
        System.out.println("Matrícula: " + estudante1.matricula);
    }
}