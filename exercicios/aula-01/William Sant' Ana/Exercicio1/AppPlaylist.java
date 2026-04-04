class Faixa {
    String nome;
    String cantor;
    int duracao; // em segundos

    void exibir() {
        System.out.println(nome + " - " + cantor);
    }
}

public class AppPlaylist {
    public static void main(String[] args) {

        Faixa f1 = new Faixa();
        f1.nome = "Byte Beats";
        f1.cantor = "Code Crew";
        f1.duracao = 200;

        Faixa f2 = new Faixa();
        f2.nome = "Late Night Coding";
        f2.cantor = "Null Pointers";
        f2.duracao = 175;

        System.out.println("Primeira faixa:");
        f1.exibir();

        System.out.println("Segunda faixa:");
        f2.exibir();

        // Alterando nome da segunda faixa
        f2.nome = "Early Morning Coding";

        System.out.println("Segunda faixa atualizada:");
        f2.exibir();
    }
}