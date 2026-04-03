public class DadosLivro{
    public static void main(String[] args){
        Livro meulivro = new Livro();
        meulivro.titulo = "Senhor dos Aneis";
        meulivro.autor = "J.R.R. Tolkien";
        meulivro.paginas = 1200;
        System.out.println(" Livro: " + meulivro.titulo +
            " o autor se chama: " + meulivro.autor +
            " o livro tem: " + meulivro.paginas + " paginas");
        meulivro.paginas = 1700;
        System.out.println(" Nova edicao: " + meulivro.titulo +
            " o autor se chama: " + meulivro.autor +
            " o livro tem: " + meulivro.paginas + " paginas");
    }
}