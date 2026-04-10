public class Livro {
    String titulo;
    String autor;
    int paginas;
}

public class TesteLivro {
    public static void main(String[] args) {

        Livro meuLivro = new Livro();

        meuLivro.titulo = "Java para Iniciantes";
        meuLivro.autor = "João Pereira";
        meuLivro.paginas = 180;

        System.out.println("=== Informações do Livro ===");
        System.out.println(meuLivro.titulo + ", escrito por "
                + meuLivro.autor + ", possui "
                + meuLivro.paginas + " páginas.");

        // Atualizando número de páginas
        meuLivro.paginas = 220;

        System.out.println("\n=== Após atualização ===");
        System.out.println(meuLivro.titulo + ", escrito por "
                + meuLivro.autor + ", agora possui "
                + meuLivro.paginas + " páginas.");
    }
}