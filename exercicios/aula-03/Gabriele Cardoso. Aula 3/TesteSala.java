import java.util.Scanner;

class Sala {
    String nome;
    double temperatura;
}

public class TesteSala {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Sala ambiente = new Sala();

        System.out.print("Digite o nome da sala: ");
        ambiente.nome = input.nextLine();

        System.out.print("Informe a temperatura (°C): ");
        ambiente.temperatura = input.nextDouble();

        System.out.println("\n=== Dados da Sala ===");
        System.out.println("Sala: " + ambiente.nome);
        System.out.println("Temperatura: " + ambiente.temperatura + " °C");

        if (ambiente.temperatura < 20) {
            System.out.println("Classificação: Ambiente frio");
        } else if (ambiente.temperatura <= 25) {
            System.out.println("Classificação: Ambiente confortável");
        } else {
            System.out.println("Classificação: Ambiente quente");
        }

        input.close();
    }
}