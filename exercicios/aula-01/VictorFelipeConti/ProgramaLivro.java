public class ProgramaLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "O Assassinato de Roger Ackroyd";
        livro.autor = "Agatha Christie";
        livro.paginas = 275;

        System.out.println("O livro " + livro.titulo + " foi escrito por " + livro.autor + " e possui " + livro.paginas + " páginas.");

        livro.paginas = 300;

        System.out.println("O livro " + livro.titulo + " foi escrito por " + livro.autor + " e possui " + livro.paginas + " páginas.");

    }
}
