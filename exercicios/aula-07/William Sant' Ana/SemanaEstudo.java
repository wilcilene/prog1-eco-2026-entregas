import java.util.Scanner;

class DiaEstudo {
    String nomeDia;
    int tempo;
}

public class SemanaEstudo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DiaEstudo[] dias = new DiaEstudo[7];

        String[] nomes = {"Seg", "Ter", "Qua", "Qui", "Sex", "Sab", "Dom"};

        int soma = 0;
        int indiceMaior = 0;

        for (int i = 0; i < dias.length; i++) {
            dias[i] = new DiaEstudo();
            dias[i].nomeDia = nomes[i];

            System.out.print("Tempo em " + nomes[i] + ": ");
            dias[i].tempo = sc.nextInt();

            soma += dias[i].tempo;

            if (dias[i].tempo > dias[indiceMaior].tempo) {
                indiceMaior = i;
            }
        }

        System.out.println("\nTotal estudado: " + soma + " min");
        System.out.println("Dia com mais estudo: " +
                dias[indiceMaior].nomeDia + " (" +
                dias[indiceMaior].tempo + " min)");

        sc.close();
    }
}