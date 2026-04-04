class Player {
    String nick;
    int score;

    void mostrar() {
        System.out.println(nick + " - " + score + " pts");
    }
}

public class SistemaRanking {

    public static void main(String[] args) {

        Player[] lista = new Player[3];

        lista[0] = criarPlayer("Lucas", 150);
        lista[1] = criarPlayer("Marcos", 220);
        lista[2] = criarPlayer("Rafael", 190);

        Player melhor = encontrarTop(lista);

        System.out.println("Top jogador:");
        melhor.mostrar();
    }

    static Player criarPlayer(String nome, int pontos) {
        Player p = new Player();
        p.nick = nome;
        p.score = pontos;
        return p;
    }

    static Player encontrarTop(Player[] lista) {
        Player top = lista[0];

        for (int i = 1; i < lista.length; i++) {
            if (lista[i].score > top.score) {
                top = lista[i];
            }
        }

        return top;
    }
}