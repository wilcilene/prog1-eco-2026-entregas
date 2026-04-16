public class ProgramaMusica {
    
    public static void main(String[] args){

        Musica aMusica = new Musica();

        aMusica.titulo = "Musica";
        aMusica.artista = "Artista";
        aMusica.duracaoEmSegundos = 1600;

        aMusica.resumoMusica();

        Musica oMusica = new Musica();

        oMusica.titulo = "Musico";
        oMusica.artista = "Artisto";
        oMusica.duracaoEmSegundos = 1808;

        oMusica.resumoMusica();

        oMusica.titulo = "Musicao";
        oMusica.resumoMusica();

    }
}
