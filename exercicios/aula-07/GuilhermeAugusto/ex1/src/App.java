import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        double nota;
        double media = 0.0;
        int q1 = 0;
        int q2 = 0;
        int q3 = 0;

        System.out.println("Numero de alunos:");
        int qtdAlunos = obj.nextInt();
        obj.nextLine();
        double[] notasAlunos = new double[qtdAlunos];

        for(int i = 0; i < qtdAlunos; i++){
            System.out.println("Nota aluno " + (i+1));
            nota = obj.nextDouble();
            obj.nextLine();

            media += nota / qtdAlunos;

            notasAlunos[i] = nota;

            if(notasAlunos[i] < 6){
                q1 += 1;
            }else if(notasAlunos[i] < 7.9){
                q2 += 1;
            }else if(notasAlunos[i] < 10){
                q3 += 1;
            }
        }
        System.out.println("\n\nMedia dos alunos: " + media);
        System.out.println("\nNOTAS:\nAbaixo de 6: " + q1);
        System.out.println("Entre 6 e 7.9: " + q2);
        System.out.println("8 ou mais: " + q3);
    }
}
