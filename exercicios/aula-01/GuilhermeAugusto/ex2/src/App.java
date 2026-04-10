import java.util.Random;
import java.util.Scanner;

class Carro{
    boolean fantasma;

    public Carro(boolean fantasma){
        this.fantasma = fantasma;
    }

    void ligar(){
        if (fantasma == true) {
            System.out.println("Carro fantasma apareceu do nada!");
        }else{
            System.out.println("Carro ligado.");
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        boolean rodando = true;

        while(rodando){
            System.out.println("[1] Ligar carro");
            System.out.println("[2] Sair");
            int opc = obj.nextInt();

            switch (opc) {
                case 1:
                    Random r = new Random();
                    boolean rand = r.nextBoolean();
                    Carro c = new Carro(rand);
                    c.ligar();
                    break;
                case 2:
                    rodando = false;
                    break;
                default:
                    break;
            }

        }
        obj.close();
    }
}