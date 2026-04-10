import java.util.Scanner;

class CarroJogador{
    int nivelNitro = 100;

    void usarNitro(){
        if (nivelNitro <= 0) {
            System.out.println("Nitro acabou.");
        }else{
            nivelNitro -= 20;
            System.out.println("Nivel do nitro: " + nivelNitro);
        }
    }
    void recarregarNitro(){
        System.out.println("Nitro recarregado!");
        while (nivelNitro < 100) {
            nivelNitro += 1;
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        CarroJogador carro = new CarroJogador();
        boolean rodando = true;
        Scanner obj = new Scanner(System.in);

        while (rodando) {
            System.out.println("[1] Usar nitro");
            System.out.println("[2] Recarregar nitro");
            System.out.println("[3] Sair");
            int opc = obj.nextInt();

            switch (opc) {
                case 1:
                    carro.usarNitro();
                    break;
                case 2:
                    carro.recarregarNitro();
                    break;
                case 3:
                    rodando = false;
                default:
                    break;
            }
        }
        obj.close();
    }
}