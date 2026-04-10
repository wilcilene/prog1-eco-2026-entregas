import java.util.Scanner;

class EstudoDia {
    String dia;
    int minutos;
}

public class ControleEstudos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        EstudoDia[] semana = new EstudoDia[7];

        String[] dias = {
            "Segunda", "Terça", "Quarta", "Quinta",
            "Sexta", "Sábado", "Domingo"
        };

        int total = 0;
        EstudoDia maior = null;

        for (int i = 0; i < 7; i++) {
            semana[i] = new EstudoDia();
            semana[i].dia = dias[i];

            System.out.print("Minutos estudados na " + dias[i] + ": ");
            semana[i].minutos = entrada.nextInt();

            total += semana[i].minutos;

            if (maior == null || semana[i].minutos > maior.minutos) {
                maior = semana[i];
            }
        }

        System.out.println("\nTotal de minutos: " + total);
        System.out.println("Dia com mais estudo: " + maior.dia + " (" + maior.minutos + " min)");

        entrada.close();
    }
}