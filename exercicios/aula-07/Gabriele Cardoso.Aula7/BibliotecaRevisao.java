import java.util.ArrayList;
import java.util.Scanner;

class Livro {
    String titulo;
    String autor;
    int paginas;

    Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    void resumir() {
        System.out.println(titulo + " - " + autor
                + " (" + paginas + " páginas)");
    }
}

public class BibliotecaRevisao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        while (true) {
            System.out.print("Título do livro (fim para encerrar): ");
            String titulo = entrada.nextLine();

            if (titulo.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Autor: ");
            String autor = entrada.nextLine();

            System.out.print("Número de páginas: ");
            int paginas = entrada.nextInt();
            entrada.nextLine();

            livros.add(new Livro(titulo, autor, paginas));
        }

        System.out.println("\nLivros com mais de 300 páginas:");
        for (Livro l : livros) {
            if (l.paginas > 300) {
                l.resumir();
            }
        }

        entrada.close();
    }
}