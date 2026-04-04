import java.util.Scanner;

class Boletim {
    double[] notas = new double[4];

    double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    void mostrarResultado() {
        double media = calcularMedia();

        System.out.println("Média final: " + media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 5) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}

public class SistemaNotas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Boletim aluno = new Boletim();

        for (int i = 0; i < aluno.notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            aluno.notas[i] = sc.nextDouble();
        }

        aluno.mostrarResultado();

        sc.close();
    }
}