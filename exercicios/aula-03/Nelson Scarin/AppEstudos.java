import java.util.Scanner;

class SessaoEstudo {
    String materia;
    int tempoMin;

    String avaliarTempo() {
        if (tempoMin < 30) {
            return "Início promissor!";
        } else if (tempoMin < 60) {
            return "Você está indo bem!";
        } else {
            return "Foco total!";
        }
    }

    void mostrarResumo() {
        System.out.println("Matéria: " + materia);
        System.out.println("Tempo estudado: " + tempoMin + " minutos");
        System.out.println("Avaliação: " + avaliarTempo());
    }
}

public class AppEstudos {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        SessaoEstudo s = new SessaoEstudo();

        System.out.print("Qual matéria você estudou? ");
        s.materia = leitor.nextLine();

        System.out.print("Tempo de estudo (min): ");
        s.tempoMin = leitor.nextInt();

        s.mostrarResumo();

        leitor.close();
    }
}