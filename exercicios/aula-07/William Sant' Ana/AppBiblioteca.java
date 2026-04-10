import java.util.ArrayList;
import java.util.Scanner;

class Obra {
    String nome;
    String escritor;
    int qtdPaginas;

    Obra(String nome, String escritor, int qtdPaginas) {
        this.nome = nome;
        this.escritor = escritor;
        this.qtdPaginas = qtdPaginas;
    }

    void mostrar() {
        System.out.println(nome + " - " + escritor +
                " (" + qtdPaginas + " pág)");
    }
}

public class AppBiblioteca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Obra> lista = new ArrayList<>();

        while (true) {
            System.out.print("Digite o título (0 para sair): ");
            String t = sc.nextLine();

            if (t.equals("0")) break;

            System.out.print("Autor: ");
            String a = sc.nextLine();

            System.out.print("Páginas: ");
            int p = sc.nextInt();
            sc.nextLine();

            lista.add(new Obra(t, a, p));
        }

        System.out.println("\nLivros grandes:");
        for (Obra o : lista) {
            if (o.qtdPaginas > 300) {
                o.mostrar();
            }
        }

        sc.close();
    }
}