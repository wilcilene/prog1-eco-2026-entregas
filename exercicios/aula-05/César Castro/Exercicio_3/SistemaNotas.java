package Exercicio_3;

import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[5]; // tamanho fixo

        // Entrada das notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double soma = 0;
        double maior = notas[0];
        double menor = notas[0];

        // Processamento
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];

            if (notas[i] > maior) {
                maior = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        double media = soma / notas.length;

        // Saída
        System.out.println("\nResultados:");
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);

        entrada.close();
    }
}
