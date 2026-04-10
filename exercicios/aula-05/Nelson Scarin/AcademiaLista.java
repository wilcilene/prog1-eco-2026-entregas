import java.util.ArrayList;
import java.util.Scanner;

class PessoaTreino {
    String nome;
    int diasSemana;

    String nivel() {
        if (diasSemana == 0) {
            return "Inativo";
        } else if (diasSemana <= 2) {
            return "Iniciante";
        } else if (diasSemana <= 4) {
            return "Dedicado";
        } else {
            return "Atleta";
        }
    }
}

public class AcademiaLista {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<PessoaTreino> alunos = new ArrayList<>();

        int parada = 0;

        while (true) {
            System.out.print("Adicionar aluno? (1 = sim / 0 = não): ");
            parada = sc.nextInt();
            sc.nextLine();

            if (parada == 0) break;

            PessoaTreino p = new PessoaTreino();

            System.out.print("Nome: ");
            p.nome = sc.nextLine();

            System.out.print("Dias de treino na semana: ");
            p.diasSemana = sc.nextInt();
            sc.nextLine();

            alunos.add(p);

            System.out.println("Classificação: " + p.nivel());
            System.out.println();
        }

        int inativo = 0, iniciante = 0, dedicado = 0, atleta = 0;

        for (PessoaTreino p : alunos) {
            switch (p.nivel()) {
                case "Inativo":
                    inativo++;
                    break;
                case "Iniciante":
                    iniciante++;
                    break;
                case "Dedicado":
                    dedicado++;
                    break;
                case "Atleta":
                    atleta++;
                    break;
            }
        }

        System.out.println("=== Resumo ===");
        System.out.println("Inativos: " + inativo);
        System.out.println("Iniciantes: " + iniciante);
        System.out.println("Dedicados: " + dedicado);
        System.out.println("Atletas: " + atleta);

        sc.close();
    }
}