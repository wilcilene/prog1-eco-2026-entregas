
import java.util.Scanner;

class Sala {
    String nome;
    double temperatura;
}

 class ProgramaSala {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Sala sala = new Sala();

        System.out.print("Nome da sala: ");
        sala.nome = entrada.nextLine();

        System.out.print("Temperatura atual da sala: ");
        sala.temperatura = entrada.nextDouble();

        System.out.println("Sala: " + sala.nome
                + " | Temperatura: " + sala.temperatura + " ºC");

        if (sala.temperatura < 20) {
            System.out.println("Situação: Fria");
        } else if (sala.temperatura <= 25) {
            System.out.println("Situação: Confortável");
        } else {
            System.out.println("Situação: Quente");
        }

        entrada.close();
    }
}
