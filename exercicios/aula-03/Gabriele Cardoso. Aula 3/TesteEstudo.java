import java.util.Scanner;

class Estudo {
    String disciplina;
    int minutos;
}

public class TesteEstudo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Estudo registro = new Estudo();

        System.out.print("Informe a disciplina: ");
        registro.disciplina = input.nextLine();

        System.out.print("Tempo de estudo (em minutos): ");
        registro.minutos = input.nextInt();

        System.out.println("\nResumo do dia:");
        System.out.println("Disciplina: " + registro.disciplina);
        System.out.println("Tempo estudado: " + registro.minutos + " minutos");

        if (registro.minutos < 30) {
            System.out.println("Resultado: Bom começo!");
        } else if (registro.minutos < 60) {
            System.out.println("Resultado: Boa dedicação!");
        } else {
            System.out.println("Resultado: Modo focado ativado!");
        }

        input.close();
    }
}