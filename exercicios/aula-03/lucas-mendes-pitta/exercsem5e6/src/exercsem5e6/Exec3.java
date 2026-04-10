package exercsem5e6;
import java.util.Scanner;
public class Exec3 {
	String disciplina;
    int minutos;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Exec3 estudo = new Exec3();

        System.out.print("Disciplina: ");
        estudo.disciplina = sc.nextLine();

        System.out.print("Quantos minutos você estudou hoje: ");
        estudo.minutos = sc.nextInt();

        System.out.println("Você estudou " + estudo.minutos
                + " minutos de " + estudo.disciplina + ".");

        if (estudo.minutos < 30) {
            System.out.println("Bom começo!");
        } else if (estudo.minutos < 60) {
            System.out.println("Boa dedicação!");
        } else {
            System.out.println("Modo focado ativado!");
        }

        sc.close();
    }
}
