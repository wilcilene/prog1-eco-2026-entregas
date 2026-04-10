import java.util.Scanner;

public class MediaTurma {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de alunos: ");
        int quantidade = entrada.nextInt();

        double[] notas = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double soma = 0;
        int abaixo6 = 0;
        int entre6e79 = 0;
        int acima8 = 0;

        for (int i = 0; i < quantidade; i++) {
            soma += notas[i];

            if (notas[i] < 6) {
                abaixo6++;
            } else if (notas[i] < 8) {
                entre6e79++;
            } else {
                acima8++;
            }
        }

        double media = soma / quantidade;

        System.out.printf("Média: %.2f\n", media);
        System.out.println("Abaixo de 6: " + abaixo6);
        System.out.println("Entre 6 e 7.9: " + entre6e79);
        System.out.println("8 ou mais: " + acima8);

        entrada.close();
    }
}