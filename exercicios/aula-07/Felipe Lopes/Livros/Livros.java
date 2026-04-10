package Livros;

import java.util.ArrayList;
import java.util.Scanner;

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
        System.out.println(titulo + " - " + autor
                + " (" + paginas + " páginas)");
    }
}
