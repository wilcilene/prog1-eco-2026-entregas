class Musica {
    String titulo;
    String artista;
    int duracaoEmSegundos;
}

public class ProgramaPlaylist {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.titulo = "ExtraL";
        musica1.artista = "Jennie and Dochii";
        musica1.duracaoEmSegundos = 204;

        Musica musica2 = new Musica();
        musica2.titulo = "Seoul";
        musica2.artista = "Jennie";
        musica2.duracaoEmSegundos = 200;

        System.out.println("Música 1: " + musica1.titulo
                + " - " + musica1.artista);

        System.out.println("Música 2: " + musica2.titulo
                + " - " + musica2.artista);

        // Editando o título da segunda música
        musica2.titulo = "Seoul City";

        System.out.println("Música 2 (atualizada): "
                + musica2.titulo + " - " + musica2.artista);
    }
}