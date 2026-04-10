package exercsem1e2;

public class Exerc4 {
	 String titulo;
	    String autor;
	    int paginas;
	    public static void main(String[] args) {
	        Exerc4 livro1 = new Exerc4();

	        livro1.titulo = "test";
	        livro1.autor = "lucas";
	        livro1.paginas = 300;

	        System.out.println("Livro: " + livro1.titulo
	                + " - " + livro1.autor
	                + " (" + livro1.paginas + " páginas)");

	     
	        livro1.paginas = 350;

	        System.out.println("Nova edição: " + livro1.titulo
	                + " - " + livro1.autor
	                + " (" + livro1.paginas + " páginas)");
	    }
}
