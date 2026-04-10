import java.util.Scanner;

class Camiseta{
    String tamanho;
    String cor;
    double preco;

    public Camiseta(String tamanho, String cor, double preco){
        this.tamanho = tamanho;
        this.cor = cor;
        this.preco = preco;
    }

    void verCamiseta(){
        if (preco > 100) {
            System.out.println("\nCamiseta premium!");
        }

        else{
            System.out.println("\nCamiseta padrao.");
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);

        System.out.println("Tamanho camiseta:");
        String tam = obj.nextLine();

        System.out.println("Cor camiseta:");
        String cor = obj.nextLine();

        System.out.println("Preco camiseta:");
        double preco = obj.nextDouble();

        Camiseta camiseta = new Camiseta(tam, cor, preco);

        camiseta.verCamiseta();

        obj.close();
    }
}
