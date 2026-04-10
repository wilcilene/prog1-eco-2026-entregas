import java.util.Scanner;

class Sala{
    String nome;
    double temperatura;

    public Sala(String nome, double temperatura){
        this.nome = nome;
        this.temperatura = temperatura;
    }

    void salaTemperatura(){
        if (temperatura < 20) {
            System.out.println("\nFria.");
        }
        
        else if(temperatura >= 20 && temperatura < 25){
            System.out.println("\nConfortavel.");
        }
        
        else{
            System.out.println("\nQuente");
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);

        System.out.println("Nome da sala: ");
        String nomeSala = obj.nextLine();

        System.out.println("Temperatura da sala: ");
        double temperaturaSala = obj.nextDouble();

        Sala sala = new Sala(nomeSala, temperaturaSala);
        sala.salaTemperatura();
        
        obj.close();
    }
}
