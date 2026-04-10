import java.util.Scanner;

public class Turma {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos da turma: ");
        int quantidade = scanner.nextInt();

        if (quantidade <= 0) {
            System.out.println("A quantidade de alunos deve ser maior que zero.");
            scanner.close();
            return;
        }

        double[] notas = new double[quantidade];

        //Leitura das notas
        for (int i = 0; i < quantidade; i++) {
            double nota;
            do { 
                System.out.printf("Digite a nota do aluno %d (0 a 10): ", i + 1);
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("  Nota inválida! Digite um valor entre 0 e 10.");
                }
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }

        //Cálculo da média e contagem por faixa
        double soma = 0;
        int abaixoDeSeis = 0;    // nota < 6.0
        int entre6e79    = 0;    // 6.0 <= nota <= 7.9
        int oitoOuMais   = 0;    // nota >= 8.0

        for (double nota : notas) {
            soma += nota;

            if (nota < 6.0) {
                abaixoDeSeis++;
            } else if (nota < 8.0) {
                entre6e79++;
            } else {
                oitoOuMais++;
            }
        }

        double media = soma / quantidade;

        //Exibição dos resultados
        System.out.println("\n======== RESULTADO DA TURMA ========");
        System.out.println("Total de alunos  : %d%n", quantidade);
        System.out.println("Média da turma   : %2f%n", media);
        System.out.println("----------------------------------");
        System.out.println("Abaixo de 6      : %d aluno(s)%n", abaixoDeSeis);
        System.out.println("Entre 6 e 7,9    : %d alunos(s)%n", entre6e79);
        System.out.println("8 ou mais       : %d aluno(s)%n", oitoOuMais);
        System.out.println("======================================");

        scanner.close();
    }
}
