public class ProgramaPlaylist {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.titulo = "Code Jam";
        musica1.artista = "Dev Band";
        musica1.duracaoEmSegundos = 210;

        Musica musica2 = new Musica();
        musica2.titulo = "Debugging Night";
        musica2.artista = "Stack Traces";
        musica2.duracaoEmSegundos = 185;

        System.out.println("Música 1: " + musica1.titulo
                + " - " + musica1.artista);

        System.out.println("Música 2: " + musica2.titulo
                + " - " + musica2.artista);

        // Editando o título da segunda música
        musica2.titulo = "Debugging Morning";

        System.out.println("Música 2 (atualizada): "
                + musica2.titulo + " - " + musica2.artista);
    }
}