class Aluno {
    String nomeCompleto;
    String codigoMatricula;

    void exibirDados() {
        System.out.println("Aluno: " + nomeCompleto);
        System.out.println("Código: " + codigoMatricula);
    }
}

public class SistemaAluno {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();

        a1.nomeCompleto = "Jorge Souza";
        a1.codigoMatricula = "2026123";

        a1.exibirDados();
    }
}