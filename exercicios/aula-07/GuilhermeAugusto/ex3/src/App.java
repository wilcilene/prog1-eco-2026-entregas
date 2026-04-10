import java.util.Scanner;

class EstudoDia{
    String dia;
    int minutos;

    public EstudoDia(String dia, int minutos){
        this.dia = dia;
        this.minutos = minutos;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        EstudoDia[] estudo = new EstudoDia[7];
        Scanner obj = new Scanner(System.in);

        int minutosEstudo = 0;
        int somaMinutos = 0;
        String maiorTempo = "";
        String diaEstudo = "";

        for(int i = 0; i < 7; i++){
            System.out.println("Dia:");
            diaEstudo = obj.nextLine();

            System.out.println("Tempo de estudo - " + diaEstudo);
            minutosEstudo = obj.nextInt();
            obj.nextLine();
            somaMinutos += minutosEstudo;

            if(i > 0){
                if(minutosEstudo > estudo[i-1].minutos){
                    maiorTempo = diaEstudo;
                }
            }

            estudo[i] = new EstudoDia(diaEstudo, minutosEstudo);
        }

        for(int i = 0; i < 7; i++){
            if (estudo[i].dia == maiorTempo) {
                System.out.println("Dia com maior tempo de estudo: " + estudo[i].dia);
                System.out.println("Tempo total de estudo: " + somaMinutos);
            }
        }
        obj.close();
    }
}
