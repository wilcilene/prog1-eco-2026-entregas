package Playlist;

public class ProgramaPlaylist {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.titulo = "Over Thinking";
        musica1.artista = "Usedcvntt";
        musica1.duracaoEmSegundos = 225;

        Musica musica2 = new Musica();
        musica2.titulo = "Caribbean Blue";
        musica2.artista = "Enya";
        musica2.duracaoEmSegundos = 338;

        System.out.println("Música 1: " + musica1.titulo
                + " - " + musica1.artista);

        System.out.println("Música 2: " + musica2.titulo
                + " - " + musica2.artista);

        // Editando o título da segunda música
        musica2.titulo = "Orinoco Flow";

        System.out.println("Música 2 (atualizada): "
                + musica2.titulo + " - " + musica2.artista);
    }
}
