import java.util.Scanner; 
import java.util.ArrayList; 

class Livro {
    String titulo; 
    String autor; 
    int paginas; 

    Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo; 
        this.autor = autor; 
        this.paginas = paginas; 
    }

    void resumir() {
        System.out.print(titulo + "-" + autor + "-" + "-páginas: " + paginas); 
    }
}

public class ProgramaBiblioteca { 
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in); 
        ArrayList<Livro> livros = new ArrayList(); 

        while(true) {
            System.out.print("Título do livro(fim para sair): "); 
            String titulo = entrada.nextLine(); 

            if (titulo.equalsIgnoreCase("fim")) {
                break; 
                }
            
            System.out.println("Autor: "); 
            String autor = entrada.nextLine(); 

            System.out.println("Número de páginas: "); 
            int paginas = entrada.nextInt(); 
            entrada.nextLine(); 

            livros.add(new Livro(titulo, autor, paginas)); 
        }

        System.out.println("Livros com mais de 300 páginas"); 
        for (Livro livro : livros) {
            if (livro.paginas >300) {
                livro.resumir(); 
            }
        }
        entrada.close(); 
    }
}