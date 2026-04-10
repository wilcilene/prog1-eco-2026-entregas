import java.util.Scanner;

class EstudanteAcademia{
    String nome;
    int frequenciaSemanal;

    public EstudanteAcademia(String nome, int frequenciaSemanal){
        this.nome = nome;
        this.frequenciaSemanal = frequenciaSemanal;
    }

    void verFrequencia(){
        System.out.println("Aluno: " + nome);
        System.out.println("Frequencia Semanal: " + frequenciaSemanal);

        if (frequenciaSemanal == 0) {
            System.out.println("Plano fantasma.\n\n");
        }
        else if (frequenciaSemanal < 3) {
            System.out.println("Modo iniciante.\n\n");
        }
        else if(frequenciaSemanal < 5){
            System.out.println("Modo focado.\n\n");
        }
        else{
            System.out.println("Modo atleta!\n\n");
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        String nomeEstudante;
        int frequencia;

        System.out.println("Quantos alunos:");
        int numeroEstudantes = obj.nextInt();
        obj.nextLine();
        EstudanteAcademia[] estudantes = new EstudanteAcademia[numeroEstudantes];

        for(int i = 0; i < numeroEstudantes; i++){
            System.out.println("Nome:");
            nomeEstudante = obj.nextLine();

            System.out.println("Frenquencia semanal de " + nomeEstudante + ":");
            frequencia = obj.nextInt();
            obj.nextLine();

            while(frequencia > 7 || frequencia < 0){
                System.out.println("Invalido!");
                System.out.println("Frenquencia semanal de " + nomeEstudante + ":");
                frequencia = obj.nextInt();
                obj.nextLine();
            }
            estudantes[i] = new EstudanteAcademia(nomeEstudante, frequencia);       
        }

        for(int i = 0; i < numeroEstudantes; i++){
            estudantes[i].verFrequencia();
        }
        obj.close();
    }
}
