//EXERCÍCIO 4

class Livro {
    
    String titulo = "Livro pequeno";
    String autor = "Rojas";
    int paginas = 80;

}

public class Livro_main{
    public static void main(String[] args){
    
        Livro livro1 = new Livro();
        System.out.println("RESUMO DO LIVRO: \nTITULO: " + livro1.titulo + "\nAUTOR: " + livro1.autor + "\nN DE PAGINAS: " + livro1.paginas);

        livro1.paginas = 100;
    
        System.out.println("RESUMO DO LIVRO: \nTITULO: " + livro1.titulo + "\nAUTOR: " + livro1.autor + "\nN DE PAGINAS: " + livro1.paginas);
    }

}