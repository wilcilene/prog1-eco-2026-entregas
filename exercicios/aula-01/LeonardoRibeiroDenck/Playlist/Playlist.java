public class Playlist{
    public static void main(String[] args) {
       Musica musica1 = new Musica();
       musica1.titulo = "dead Flowers";
       musica1.artista = "Malukah";
       musica1.duracaoEmSegundos = 302;
       Musica musica2 = new Musica();
       musica2.titulo = "It's My Life";
       musica2.artista = "Bon Jovi";
       musica2.duracaoEmSegundos = 224;
        System.out.println("Musica 1: " + musica1.titulo
                + " - " + musica1.artista);

        System.out.println("Musica 2: " + musica2.titulo
                + " - " + musica2.artista);
        musica2.titulo = "It' a Good Life";
        System.out.println("Musica 2: " + musica2.titulo
                + " - " + musica2.artista);


    }
}