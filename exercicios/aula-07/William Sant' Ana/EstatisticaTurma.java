import java.util.Scanner;

public class EstatisticaTurma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int totalAlunos = sc.nextInt();

        double[] listaNotas = new double[totalAlunos];

        // Entrada das notas
        for (int i = 0; i < listaNotas.length; i++) {
            System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
            listaNotas[i] = sc.nextDouble();
        }

        double somaNotas = 0;
        int qtdAbaixo6 = 0, qtdEntre = 0, qtdAcima8 = 0;

        // Processamento
        for (double nota : listaNotas) {
            somaNotas += nota;

            if (nota < 6) {
                qtdAbaixo6++;
            } else if (nota < 8) {
                qtdEntre++;
            } else {
                qtdAcima8++;
            }
        }

        double mediaFinal = somaNotas / totalAlunos;

        // Saída
        System.out.println("\nResultado da turma:");
        System.out.println("Média geral: " + mediaFinal);
        System.out.println("Notas < 6: " + qtdAbaixo6);
        System.out.println("Notas entre 6 e 7.9: " + qtdEntre);
        System.out.println("Notas >= 8: " + qtdAcima8);

        sc.close();
    }
}