package exercicio2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Frequencia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero de estudantes que quer cadastrar:");
        int n = entrada.nextInt();
        entrada.nextLine();
        Estudante estudante[] = new Estudante[n];
        for (int i = 0; i < n; i++) {
            estudante[i] = new Estudante();
            estudante[i].id = i;
            System.out.println("digite o nome do estudante [" + (i + 1) + "]");
            estudante[i].nome = entrada.nextLine();
            System.out.println(
                "digite sua frequencia semanal do estudante [" + (i + 1) + "]:"
            );
            estudante[i].frequencia = entrada.nextInt();
            entrada.nextLine();
        }
        for (int i = 0; i < n; i++) {
            if (estudante[i].frequencia == 0) {
                System.out.println(
                    estudante[i].nome + " esta  no plano espiritual"
                );
            } else if (
                estudante[i].frequencia > 0 && estudante[i].frequencia <= 2
            ) {
                System.out.println(
                    estudante[i].nome + " esta no modo iniciante"
                );
            } else if (
                estudante[i].frequencia > 2 && estudante[i].frequencia <= 4
            ) {
                System.out.println(estudante[i].nome + " esta no modo focado");
            } else if (
                estudante[i].frequencia > 4 && estudante[i].frequencia <= 7
            ) {
                System.out.println(estudante[i].nome + " esta no modo deus");
            } else {
                System.out.print(
                    "a frequencia deve ser menor que 7 e escrita na forma numerica"
                );
            }
        }
        try {
            FileWriter escritor = new FileWriter("estudantes.json");
            escritor.write("[");
            for (int i = 0; i < n; i++) {
                escritor.write(transformarJson(estudante[i]));
                if (i < n - 1) {
                    escritor.write(",\n");
                }
            }
            escritor.write("]");
            escritor.close();
            System.out.println(
                "todos os " + n + " estudantes foram salvos no arquivo!"
            );
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo.");
        }

        entrada.close();
    }

    public static String transformarJson(Estudante est) {
        return (
            "{" +
            "\"id\":" +
            est.id +
            "," +
            "\"nome\": \"" +
            est.nome +
            "\"," +
            "\"frequencia\": " +
            est.frequencia +
            "}"
        );
    }
}
