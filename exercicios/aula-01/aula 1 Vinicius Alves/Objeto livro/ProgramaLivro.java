public class ProgramaLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.titulo = "Introdução ao Java";
        livro1.autor = "Maria Souza";
        livro1.paginas = 250;

        System.out.println("Livro: " + livro1.titulo
                + " - " + livro1.autor
                + " (" + livro1.paginas + " páginas)");

        // Editando o número de páginas
        livro1.paginas = 300;

        System.out.println("Nova edição: " + livro1.titulo
                + " - " + livro1.autor
                + " (" + livro1.paginas + " páginas)");
    }
}