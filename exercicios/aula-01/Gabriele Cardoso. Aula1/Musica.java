public class Musica {
    String titulo;
    String artista;
    int duracaoEmSegundos;
}

public class TestePlaylist {
    public static void main(String[] args) {

        Musica faixa1 = new Musica();
        faixa1.titulo = "Noite de Código";
        faixa1.artista = "Programadores";
        faixa1.duracaoEmSegundos = 200;

        Musica faixa2 = new Musica();
        faixa2.titulo = "Erro 404";
        faixa2.artista = "Bugados";
        faixa2.duracaoEmSegundos = 180;

        System.out.println("=== Playlist ===");
        System.out.println("1ª música: " + faixa1.titulo + " - " + faixa1.artista);
        System.out.println("2ª música: " + faixa2.titulo + " - " + faixa2.artista);

        // Alterando o título da segunda música
        faixa2.titulo = "Erro Corrigido";

        System.out.println("\nApós edição:");
        System.out.println("2ª música atualizada: " + faixa2.titulo + " - " + faixa2.artista);
    }
}