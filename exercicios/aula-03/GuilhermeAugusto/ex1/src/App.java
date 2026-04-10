import java.util.Scanner;

class Cofrinho{
    String nomeDono;
    double saldo;

    public Cofrinho(String nomeDono, double saldo){
        this.nomeDono = nomeDono;
        this.saldo = saldo;
    }

    void verSaldo(){
        System.out.println("\n\nCOFRINHO");
        System.out.println("O cofrinho de " + nomeDono + " agora tem R$" + saldo + " reais.");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        String nome;
        double saldo;

        System.out.println("Nome: ");
        nome = obj.nextLine();

        System.out.println("Valor para deposito: ");
        saldo = obj.nextDouble();

        Cofrinho cofre = new Cofrinho(nome, saldo);
        cofre.verSaldo();

        obj.close();
    }
}
