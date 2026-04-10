package exercsem1e2;

public class Exerc2 {
	 String modelo;
	    boolean ligado;
	    boolean fantasma;

	    void ligar() {
	        ligado = true;
	        if (fantasma) {
	            System.out.println("Carro fantasma apareceu do nada");
	        } else {
	            System.out.println("Carro ligado");
	        }
	    }

	    void desligar() {
	        ligado = false;
	        System.out.println("Carro desligado");
	    }
 public static void main(String[] args) {
     Exerc2 carroNormal = new Exerc2();
	        carroNormal.modelo = "Sedan";
	        carroNormal.fantasma = false;

	        Exerc2 carroFantasma = new Exerc2();
	        carroFantasma.modelo = "Fantasma";
	        carroFantasma.fantasma = true;

	        System.out.println("Ligando o carro normal:");
	        carroNormal.ligar();

	        System.out.println("Ligando o carro fantasma:");
	        carroFantasma.ligar();
	    }
}
