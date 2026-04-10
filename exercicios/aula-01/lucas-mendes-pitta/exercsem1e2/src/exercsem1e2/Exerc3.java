package exercsem1e2;

public class Exerc3 {
	String nome;
    String matricula;
    public static void main(String[] args) {
        Exerc3 estudante1 = new Exerc3();

        estudante1.nome = "Lucas Mendes";
        estudante1.matricula = "123456";

        System.out.println("Nome do estudante: " + estudante1.nome);
        System.out.println("Matrícula: " + estudante1.matricula);
    }
}
