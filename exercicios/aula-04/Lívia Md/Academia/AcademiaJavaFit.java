package Academia;

import java.util.Scanner;
public class AcademiaJavaFit{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual o numero de estudantes que vai ser cadastrado: ");
        int n = entrada.nextInt();
        entrada.nextLine();
        EstudanteAcademia[] estudantes = new EstudanteAcademia[n];
        int  fantasma = 0;
        int iniciante = 0;
        int focado = 0;
        int atleta = 0;
        for(int i = 0; i < n; i++){
            estudantes[i] = new EstudanteAcademia();
            System.out.print("Nome do estudante" + (i + 1) + ": ");
            estudantes[i].nome = entrada.nextLine();
            System.out.print("Frequencia da semana por dia: ");
            estudantes[i].frequenciaSemanal = entrada.nextInt();
            entrada.nextLine();
            int b = estudantes[i].frequenciaSemanal;
            if(b == 0){
                fantasma++;
                System.out.println("Plano fantasma");
            }else if (b <=2){
                iniciante++;
                System.out.println("Modo iniciante");
            }else if(b <= 4){
                focado++;
                System.out.println("Modo focado");
            }else{
                atleta++;
                System.out.println("Modo atleta");
            }
            System.out.println();
        }
        System.out.println("Resumo da semana da academia");
        System.out.println("Plano fantasma: " + fantasma);
        System.out.println("Modo Iniciante: " + iniciante);
        System.out.println("Modo focado: " + focado);
        System.out.println("Modo atleta: " + atleta);
    }
}