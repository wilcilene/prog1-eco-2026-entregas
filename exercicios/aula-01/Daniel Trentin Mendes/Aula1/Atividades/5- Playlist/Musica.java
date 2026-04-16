public class Musica {
    
    String titulo;
    String artista;
    int duracaoEmSegundos;

    void resumoMusica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duracao da musica (em segundos): " + duracaoEmSegundos);
    }
}
