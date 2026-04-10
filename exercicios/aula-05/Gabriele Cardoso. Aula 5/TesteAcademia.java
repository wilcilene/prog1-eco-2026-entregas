import java.util.Scanner;

class EstudanteAcademia {
    String nome;
    int frequenciaSemanal;
}

public class TesteAcademia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos: ");
        int total = input.nextInt();
        input.nextLine();

        EstudanteAcademia[] lista = new EstudanteAcademia[total];

        int qtdFantasma = 0, qtdIniciante = 0, qtdFocado = 0, qtdAtleta = 0;

        for (int i = 0; i < total; i++) {
            lista[i] = new EstudanteAcademia();

            System.out.print("Nome do aluno " + (i + 1) + ": ");
            lista[i].nome = input.nextLine();

            System.out.print("Dias de treino na semana: ");
            lista[i].frequenciaSemanal = input.nextInt();
            input.nextLine();

            int freq = lista[i].frequenciaSemanal;

            if (freq == 0) {
                qtdFantasma++;
                System.out.println("Classificação: Plano fantasma");
            } else if (freq <= 2) {
                qtdIniciante++;
                System.out.println("Classificação: Iniciante");
            } else if (freq <= 4) {
                qtdFocado++;
                System.out.println("Classificação: Focado");
            } else {
                qtdAtleta++;
                System.out.println("Classificação: Atleta!");
            }

            System.out.println();
        }

        System.out.println("=== Resumo Geral ===");
        System.out.println("Fantasma: " + qtdFantasma);
        System.out.println("Iniciante: " + qtdIniciante);
        System.out.println("Focado: " + qtdFocado);
        System.out.println("Atleta: " + qtdAtleta);

        input.close();
    }
}