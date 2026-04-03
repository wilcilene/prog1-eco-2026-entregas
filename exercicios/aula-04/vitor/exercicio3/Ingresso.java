package exercicio3;

public class Ingresso {

    String filme;
    String horario;
    Boolean meiaEntrada;

    void finalPrice() {
        if (meiaEntrada == true) {
            System.out.println("o preco de 15");
        } else {
            System.out.println("com o preco de 30");
        }
    }
}
