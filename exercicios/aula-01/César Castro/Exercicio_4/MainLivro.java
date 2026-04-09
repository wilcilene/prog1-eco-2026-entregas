package Exercicio_4;
public class MainLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "harry potter";
        livro1.autor = "JK Rowling";
        livro1.paginas = 400;

        System.out.println("Livro: " + livro1.titulo
                + " - " + livro1.autor
                + " (" + livro1.paginas + " páginas)");

        // Editando o número de páginas
        livro1.paginas = 500;

        System.out.println("Nova edição: " + livro1.titulo
                + " - " + livro1.autor
                + " (" + livro1.paginas + " páginas)");
    }
}