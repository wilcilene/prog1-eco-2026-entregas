import java.util.Scanner;

public class ProgramaTarefa {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas tarefas você quer completar?: ");
        int n = entrada.nextInt();

        Tarefa[] tarefa = new Tarefa[n];

        entrada.nextLine();

        for (int i = 0; i < n; i++){

            System.out.println("Tarefa '" + (i + 1) + "': ");
            tarefa[i] = new Tarefa();

            System.out.print("Descrição: ");
            tarefa[i].descricao = entrada.nextLine();
            tarefa[i].concluida = false;
        }
            int num = 0;
            do{
                System.out.print("Digite o numero da tarefa concluida (0 para sair): ");
                num = entrada.nextInt();

                if (num > 0 && num <= n) {
                    tarefa[num - 1].concluida = true; 
                }else {
                    System.out.println("Valor invalido");
                }

            }while (num !=0);

            for (int a = 0; a < n; a++){
                if (tarefa[a].concluida == true){
                    System.out.println("Tarefa " + (a+1) + " Ok");
                }else{
                    System.out.println("Tarefa " + (a+1) + " Pendente");
                }
                
            }

            entrada.close();
    }
    
}
