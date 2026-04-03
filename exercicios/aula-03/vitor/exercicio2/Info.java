package exercicio2;

import java.util.Scanner;

public class Info {

    public static void main(String[] args) {
        Sala room = new Sala();
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o nome da sala:");
        room.sala = entrada.nextLine();
        System.out.println("digite a temperatura da sala");
        room.temperatura = entrada.nextInt();
        if (room.temperatura <= 20) {
            System.out.println("a sala " + room.sala + " esta fria");
        } else if (room.temperatura > 20 && room.temperatura <= 25) {
            System.out.println("a sala " + room.sala + " esta morna");
        } else {
            System.out.println("a sala " + room.sala + " esta quente");
        }
    }
}
