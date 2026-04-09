public class ProgramaMusica {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.titulo = "Espetáculo Estranho";
        musica1.artista = "Anavitória";
        musica1.ano = 2024;
        musica1.duracaoEmSegundos = 334;

        Musica musica2 = new Musica();
        musica2.titulo = "A Maior Saudade";
        musica2.artista = "Henrique e Juliano";
        musica2.ano = 2021;
        musica2.duracaoEmSegundos = 332;

        System.out.println("Música 1: " + musica1.titulo + " - " + musica1.artista + ", sua data de lançamento: " + musica1.ano);
        System.out.println("Música 2: " + musica2.titulo + " - " + musica2.artista + ", sua data de lançamento: " + musica1.ano);

        musica2.titulo = "Amigo da Minha Saudade";
        musica2.ano = 2024;
        System.out.print("Novo título da Música 2: " + musica2.titulo + " - " + musica2.artista + ", sua data de lançamento: " + musica2.ano);
        
    }
}