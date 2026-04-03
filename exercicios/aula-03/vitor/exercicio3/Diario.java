package exercicio3;

import java.util.Scanner;

public class Diario {

    public static void main(String[] args) {
        Estudos estudoDiario = new Estudos();
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite a materia que quer registrar:");
        estudoDiario.materia = entrada.nextLine();
        System.out.println("digite os minutos estudados:");
        estudoDiario.TempoEstudo = entrada.nextInt();
        if (estudoDiario.TempoEstudo <= 30) {
            System.out.println("bom comeco");
        } else if (
            estudoDiario.TempoEstudo > 30 && estudoDiario.TempoEstudo <= 60
        ) {
            System.out.println("boa dedicacao");
        } else {
            System.out.println("modo focado ativado");
        }
    }
}
