class Musica{
    String titulo;
    String artista;
    int duracao;

    public Musica(String titulo, String artista, int duracao){
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    void resumoMusica(){
        System.out.println("Resumo musica");
        System.out.println("Titulo: " + titulo + " | Artista: " + artista + " | Duracao: " + duracao);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Musica musica1 = new Musica("a", "sim", 5654545);
        Musica musica2 = new Musica("b", "nao", 556);

        musica1.resumoMusica();
        musica2.resumoMusica();

        musica2.titulo = "c";
        musica2.resumoMusica();
    }
}
