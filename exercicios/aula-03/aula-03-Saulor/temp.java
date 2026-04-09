import java.util.Scanner;

class Sala
{
    String sala;
    double temperatura;
}

public class temp{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Sala ter = new Sala();

       System.out.println("digite o nome da sala: ");
        ter.sala = entrada.nextLine();

        System.out.println("digite a temperatura atual: ");
        double tempera = entrada.nextDouble();
        ter.temperatura = tempera;

        if(tempera < 20)
        {
            System.out.println("temperatura da sala" + ter.sala + "esta fria");
        }
        else if(tempera > 20 && tempera < 25)
        {
            System.out.println("temperatura esta confortavel");
        }
        else
        {
            System.out.println("temperatura esta quente");
        }

        entrada.close();
    }
}