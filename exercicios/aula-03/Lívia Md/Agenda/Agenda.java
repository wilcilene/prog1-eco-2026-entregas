import java.util.Scanner;

public class Agenda{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Estudo estudo = new Estudo();

        System.out.print("Digite o nome da disciplina: ");
        estudo.disciplina = entrada.nextLine();

        System.out.print("Quanto tempo voce estudou?: ");
        estudo.minutos = entrada.nextInt();

        System.out.println("Na disciplina " + estudo.disciplina
            + " voce estudou " + estudo.minutos + " minutos");
        if(estudo.minutos < 30){
            System.out.println("Um bom comeco");

        } else if(estudo.minutos <=59 ){
            System.out.println("Voce esta se dedicando");
        }else{
            System.out.println("Focado nos estudos");
        }
    }
}