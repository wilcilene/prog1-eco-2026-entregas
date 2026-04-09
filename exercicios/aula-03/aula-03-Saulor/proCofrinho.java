import java.util.Scanner;

class Cofrinho {
    String nomeDono;
    double saldo;
}

public class proCofrinho {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cofrinho cofre = new Cofrinho();

        System.out.println("Digite seu primeiro nome: ");
        cofre.nomeDono = entrada.nextLine();

        System.out.println("Digite o valor que quer guardar: ");
       double valor = entrada.nextDouble();

        cofre.saldo = valor;

        System.out.println("O cofrinho de " + cofre.nomeDono + "agora tem" + cofre.saldo + "reais");

        entrada.close();
    }
}