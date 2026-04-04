import java.util.Scanner;

class Ambiente {
    String identificacao;
    double tempAtual;

    String verificarClima() {
        if (tempAtual < 20) {
            return "Frio";
        } else if (tempAtual <= 25) {
            return "Agradável";
        } else {
            return "Quente";
        }
    }

    void exibirDados() {
        System.out.println("Ambiente: " + identificacao +
                " | Temp: " + tempAtual + " °C");
        System.out.println("Condição: " + verificarClima());
    }
}

public class SistemaAmbiente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Ambiente amb = new Ambiente();

        System.out.print("Digite o nome do ambiente: ");
        amb.identificacao = sc.nextLine();

        System.out.print("Informe a temperatura: ");
        amb.tempAtual = sc.nextDouble();

        amb.exibirDados();

        sc.close();
    }
}