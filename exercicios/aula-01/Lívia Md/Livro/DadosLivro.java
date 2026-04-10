package Livro;

public class DadosLivro{
    public static void main(String[] args){
        Livro meulivro = new Livro();

        meulivro.titulo = "Veja";
        meulivro.autor = "Roberto Civita";
        meulivro.paginas = 15;
        System.out.println("\nRevista: " + meulivro.titulo +
            "\nO autor se chama: " + meulivro.autor +
            "\nA revista tem: " + meulivro.paginas + " paginas");
        meulivro.paginas = 30;
        System.out.println("\nNova edicao: " + meulivro.titulo +
            "\nO autor se chama: " + meulivro.autor +
            "\nA revista tem: " + meulivro.paginas + " paginas");
    }
}