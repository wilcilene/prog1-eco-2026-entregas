package Exercicio_5;
public class MainMusica {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.titulo = "Deixe-me ir";
        musica1.artista = "Bon Jovi";
        musica1.duracaoEmSegundos = 150;

        Musica musica2 = new Musica();
        musica2.titulo = "Descer pra bc";
        musica2.artista = "Banda Catarinense";
        musica2.duracaoEmSegundos = 200;

        System.out.println("Música 1: " + musica1.titulo
                + " - " + musica1.artista);

        System.out.println("Música 2: " + musica2.titulo
                + " - " + musica2.artista);

        musica2.titulo = "Bergamotas assasinas";

        System.out.println("Música 2 (atualizada): "
                + musica2.titulo + " - " + musica2.artista);
    }
}