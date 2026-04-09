class Livro {
    String titulo;
    String autor;
    int paginas;
}

public class ProgramaLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.titulo = "It - a coisa";
        livro1.autor = "Stephen King";
        livro1.paginas = 1104;

        System.out.println("Livro: " + livro1.titulo
                + " - " + livro1.autor
                + " (" + livro1.paginas + " páginas)");

        // Editando o número de páginas
        livro1.paginas = 3000;

        System.out.println("Nova edição: " + livro1.titulo
                + " - " + livro1.autor
                + " (" + livro1.paginas + " páginas)");
    }
}