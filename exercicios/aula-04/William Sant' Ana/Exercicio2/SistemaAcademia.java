import java.util.Scanner;

class AlunoFit {
    String nomeAluno;
    int diasTreino;

    String classificar() {
        if (diasTreino == 0) {
            return "Inativo";
        } else if (diasTreino <= 2) {
            return "Básico";
        } else if (diasTreino <= 4) {
            return "Intermediário";
        } else {
            return "Avançado";
        }
    }
}

public class SistemaAcademia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número de alunos: ");
        int qtd = sc.nextInt();
        sc.nextLine();

        AlunoFit[] lista = new AlunoFit[qtd];

        int inativo = 0, basico = 0, medio = 0, avancado = 0;

        for (int i = 0; i < qtd; i++) {
            lista[i] = new AlunoFit();

            System.out.print("Nome: ");
            lista[i].nomeAluno = sc.nextLine();

            System.out.print("Dias de treino na semana: ");
            lista[i].diasTreino = sc.nextInt();
            sc.nextLine();

            String nivel = lista[i].classificar();
            System.out.println("Classificação: " + nivel + "\n");

            switch (nivel) {
                case "Inativo":
                    inativo++;
                    break;
                case "Básico":
                    basico++;
                    break;
                case "Intermediário":
                    medio++;
                    break;
                case "Avançado":
                    avancado++;
                    break;
            }
        }

        System.out.println("=== Relatório ===");
        System.out.println("Inativos: " + inativo);
        System.out.println("Básicos: " + basico);
        System.out.println("Intermediários: " + medio);
        System.out.println("Avançados: " + avancado);

        sc.close();
    }
}