import java.util.Scanner;

class EstudoDia {
    String dia;
    int minutos;
}

public class ControleEstudos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        EstudoDia[] semana = new EstudoDia[7];

        String[] nomesDias = {
            "Segunda", "Terça", "Quarta", "Quinta",
            "Sexta", "Sábado", "Domingo"
        };

        int total = 0;
        EstudoDia maisEstudado = null;

        for (int i = 0; i < semana.length; i++) {
            semana[i] = new EstudoDia();
            semana[i].dia = nomesDias[i];

            System.out.print("Minutos estudados na " + nomesDias[i] + ": ");
            semana[i].minutos = entrada.nextInt();

            total += semana[i].minutos;

            if (maisEstudado == null || semana[i].minutos > maisEstudado.minutos) {
                maisEstudado = semana[i];
            }
        }

        System.out.println("\nTotal de minutos na semana: " + total);
        System.out.println("Dia com mais estudo: " + maisEstudado.dia
                + " (" + maisEstudado.minutos + " minutos)");

        entrada.close();
    }
}