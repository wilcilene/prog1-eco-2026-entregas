public class ProgramaLivro {
    
    public static void main(String[] args){

        Livro novoLivro = new Livro();

        novoLivro.titulo = "Entre o Cavalo e o Lobo";
        novoLivro.autor = "Daniel Hartmann";
        novoLivro.pagina = 160;
        novoLivro.resumoLivro();

        novoLivro.pagina = 240;
        novoLivro.resumoLivro();

    }

}
