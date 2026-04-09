import java.util.Scanner;

class Estudo {
    String disciplina;
    int minutos;
}

public class ProgramaEstudo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Estudo estudo = new Estudo();
        System.out.print("Disciplina estudada: ");
        estudo.disciplina = entrada.nextLine();
        System.out.print("Quantos minutos você estudou hoje? ");
        estudo.minutos = entrada.nextInt();

        System.out.println("Você estudou " + estudo.minutos
                + " minutos de " + estudo.disciplina + ".");

        if (estudo.minutos < 30) {
            System.out.println("Bom começo!");
        } else if (estudo.minutos < 60) {
            System.out.println("Boa dedicação!");
        } else {
            System.out.println("Modo focado ativado!");
        }

        entrada.close();
    }
}