import java.util.ArrayList;
import java.util.Scanner;

class EstudanteAcademia {
    String nome;
    int frequenciaSemanal;
}

public class AcademiaJavaFit {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos estudantes serão cadastrados? ");
        int n = entrada.nextInt();
        entrada.nextLine();

        ArrayList<EstudanteAcademia> estudantes = new ArrayList<>();

        int fantasma = 0, iniciante = 0, focado = 0, atleta = 0;

        for (int i = 0; i < n; i++) {
            EstudanteAcademia estudante = new EstudanteAcademia();

            System.out.print("Nome do estudante " + (i + 1) + ": ");
            estudante.nome = entrada.nextLine();

            System.out.print("Frequência semanal (dias por semana): ");
            estudante.frequenciaSemanal = entrada.nextInt();
            entrada.nextLine();

            estudantes.add(estudante);

            int f = estudante.frequenciaSemanal;

            if (f == 0) {
                fantasma++;
                System.out.println("Plano fantasma.");
            } else if (f <= 2) {
                iniciante++;
                System.out.println("Modo iniciante.");
            } else if (f <= 4) {
                focado++;
                System.out.println("Modo focado.");
            } else {
                atleta++;
                System.out.println("Modo atleta!");
            }
            System.out.println();
        }

        System.out.println("=== Resumo da Academia ===");
        System.out.println("Plano fantasma: " + fantasma);
        System.out.println("Modo iniciante: " + iniciante);
        System.out.println("Modo focado: " + focado);
        System.out.println("Modo atleta!: " + atleta);

        entrada.close();
    }
}