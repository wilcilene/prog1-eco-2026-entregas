import java.util.Scanner;

class Estudo{
    String disciplina;
    int minutos;

    public Estudo(String disciplina, int minutos){
        this.disciplina = disciplina;
        this.minutos = minutos;
    }

    void resumoEstudo(){
        if (minutos < 30) {
            System.out.println("\nBom comeco!");
        }

        else if(minutos >= 30 && minutos < 59){
            System.out.println("\nBoa dedicacao!");
        }

        else if(minutos > 59){
            System.out.println("\nModo focado ativado!");
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);

        System.out.println("Nome da materia:");
        String nome = obj.nextLine();

        System.out.println("Minutos estudados:");
        int min = obj.nextInt();

        Estudo estudo = new Estudo(nome, min);

        estudo.resumoEstudo();

        obj.close();
    }
}
