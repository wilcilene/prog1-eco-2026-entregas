class Livro{
    String titulo;
    String autor;
    int paginas;

    public Livro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    void resumoLivro(){
        System.out.println("Resumo do livro:");
        System.out.println("Titulo: " + titulo + " | Autor: " + autor + " | Paginas: " + paginas);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Livro livro = new Livro("AS", "b", 2000);

        livro.resumoLivro();

        livro.paginas = 26;
        livro.resumoLivro();
    }
}
