import java.util.Scanner;

public class MediaTurma {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // --- Entrada de Dados ---
        System.out.print("Quantidade de alunos: ");
        int n = entrada.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        // --- Processamento e Lógica ---
        double soma = 0.0;
        int abaixo6 = 0;
        int entre6e79 = 0;
        int acima8 = 0;

        for (int i = 0; i < n; i++) {
            soma += notas[i];

            if (notas[i] < 6) {
                abaixo6++;
            } else if (notas[i] < 8) {
                entre6e79++;
            } else {
                acima8++;
            }
        }

        double media = soma / n;

        // --- Saída de Resultados ---
        System.out.println("Média: " + media);
        System.out.println("Abaixo de 6: " + abaixo6);
        System.out.println("Entre 6 e 7.9: " + entre6e79);
        System.out.println("8 ou mais: " + acima8);

        entrada.close();
    }
}