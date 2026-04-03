package exercicio4;

import java.util.Scanner;

public class Resumo {

    public static void main() {
        Livro book = new Livro();
        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Digite o titulo do livro:");
        book.titulo = entradaDados.nextLine();
        System.out.println("Digite o autor do livro:");
        book.autor = entradaDados.nextLine();
        System.out.println("Digite o numero de paginas do livro:");
        book.paginas = entradaDados.nextInt();
        int n = book.paginas;
        int y;
        int controle = 0;
        System.out.println(
            "o " +
                book.titulo +
                " tem " +
                book.paginas +
                " paginas e foi escrito por " +
                book.autor
        );
        do {
            System.out.println(
                "digite [1] para editar o numero de paginas\ndigite[qualquer outro numero] para concluir o cadastro do livro"
            );
            y = entradaDados.nextInt();
            if (y == 1) {
                System.out.println("digite o novo numero de paginas:");
                book.paginas = entradaDados.nextInt();
                System.out.println("numero de paginas alteradas");
            } else {
                System.out.println("cadastro do livro concluido");
                controle = 1;
            }
        } while (controle != 1);
    }
}
