class Musica {
    
    String titulo;
    String artista;
    int duracao;
}

public class Musica_main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.titulo = "Lying figure";
        musica1.artista = "Midwinter";
        musica1.duracao = 175;

        Musica musica2 = new Musica();
        musica2.titulo = "Yellow";
        musica2.artista = "Coldplay";
        musica2.duracao = 266;

        System.out.println("Música 1: " + musica1.titulo
                + " - " + musica1.artista);

        System.out.println("Música 2: " + musica2.titulo
                + " - " + musica2.artista);

        
        musica2.titulo = "Yellow";

        System.out.println("Música 2 (atualizada): "
                + musica2.titulo + " - " + musica2.artista);
    }
}
        

