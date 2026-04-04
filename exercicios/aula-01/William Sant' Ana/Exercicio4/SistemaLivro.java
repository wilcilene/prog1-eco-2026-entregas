class Obra {
    String nomeLivro;
    String escritor;
    int totalPaginas;

    void mostrarInfo() {
        System.out.println("Obra: " + nomeLivro + " - " + escritor +
                " (" + totalPaginas + " págs)");
    }
}

public class SistemaLivro {
    public static void main(String[] args) {

        Obra livroA = new Obra();

        livroA.nomeLivro = "Java Básico";
        livroA.escritor = "Carlos Mendes";
        livroA.totalPaginas = 220;

        livroA.mostrarInfo();

        // Atualizando número de páginas
        livroA.totalPaginas += 80;

        System.out.println("Edição revisada:");
        livroA.mostrarInfo();
    }
}