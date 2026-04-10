import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

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
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas + "\n\n");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        ArrayList<Livro> livro = new ArrayList<Livro>();

        String removerTitulo;
        String removerAutor;
        String tituloLivro;
        String autorLivro;
        int paginasLivro;
        boolean rodando = true;
        
        while (rodando) {
            System.out.println("--------MENU LIVROS--------");
            System.out.println("[1] Adicionar novo livro.");
            System.out.println("[2] Listar livros.");
            System.out.println("[3] Livros acima de 300 paginas.");
            System.out.println("[4] Remover livro.");
            System.out.println("[5] Sair.");
            System.out.println("--------------------------");
            int opc = obj.nextInt();
            obj.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("\n\n\nTitulo:");
                    tituloLivro = obj.nextLine();

                    System.out.println("\nAutor:");
                    autorLivro = obj.nextLine();

                    System.out.println("\nPaginas:");
                    paginasLivro = obj.nextInt();
                    obj.nextLine();

                    livro.add(new Livro(tituloLivro, autorLivro, paginasLivro));
                    System.out.println("\n\nLivro adicionado!");
                    System.out.println("Digite qualquer coisa para continuar...\n\n");
                    obj.next();

                    break;
                case 2:
                    System.out.println("\n\n\n\n\nLivros adicionados:");
                    for (Livro p: livro) {
                        p.resumoLivro();
                    }

                    System.out.println("Digite qualquer coisa para continuar...\n\n");
                    obj.next();
                    break;
                
                case 3:
                    for (Livro p: livro) {
                        if (p.paginas > 300) {
                            System.out.print(p.titulo + " | ");
                            System.out.print(p.autor + " | ");
                            System.out.println(p.paginas + "\n");
                        }
                    }

                    System.out.println("Digite qualquer coisa para continuar...\n\n");
                    obj.next();
                    break;
                
                case 4:
                    System.out.print("Titulo do livro que deseja remover: ");
                    removerTitulo = obj.nextLine();

                    System.out.print("\nAutor do livro que deseja remover: ");
                    removerAutor = obj.nextLine();

                    Iterator<Livro> iterator = livro.iterator();
                    boolean encontrado = true;

                    while (iterator.hasNext()) {
                        Livro p = iterator.next();

                        if (p.titulo.equals(removerTitulo) && p.autor.equals(removerAutor)) {
                            iterator.remove();
                            System.out.println("Livro \"" + p.titulo + "\" removido.");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Livro não encontrado.");
                    }
                    
                    System.out.println("Digite qualquer coisa para continuar...\n\n");
                    obj.next();
                    break;
                case 5:
                    System.out.println("Menu encerrado.");
                    rodando = false;
                    break;
            
                default:
                    break;
            }
        }

        obj.close();
    }
}
