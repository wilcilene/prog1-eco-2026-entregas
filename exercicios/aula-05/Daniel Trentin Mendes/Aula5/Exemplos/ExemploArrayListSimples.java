import java.util.ArrayList;

public class ExemploArrayListSimples {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Livia");
        nomes.add("Miguel");
        nomes.add("Vitor");

        System.out.println("Tamanho da lista: " + nomes.size());

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome " + i + ": " + nomes.get(i));
        }

        nomes.remove(1);
        System.out.println("Depois de remover, tamanho: " + nomes.size());
    }
}
