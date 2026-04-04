package DecisoesELoops;
import java.util.*;
public class main {

	public static void main(String[] args) {
		//geração do metodo instanciador e da variavel instanciadora
		int n;
		Scanner instanciador = new Scanner(System.in);
		System.out.print("digite o numero referente a atividade que você quer verificar");
		n=instanciador.nextInt();		//seletor de atividades
		switch(n) {
		//
		// ATIVIDADE 1
		//
			case 1:
				//criando quantificador de tarefas
				int q;
				Scanner tarefas = new Scanner(System.in);
				System.out.print("\nquantas atividades você precisa fazer?");
				q=tarefas.nextInt();
				Tarefa[] tarefa = new Tarefa[q];
				//for que gera a quantidade de atividades.
				String trash=tarefas.nextLine();
				System.out.print(trash);
				//^^este 
				for(int i=0; i<q;i++) {
					tarefa[i] = new Tarefa();
					System.out.print("\n qual a descrição dessa tarefa?");
					tarefa[i].Descricao=tarefas.nextLine();
				}
				//while "verificador" de tarefas.
				int v;
				do {
				    System.out.print("\nQual atividade você finalizou? (Caso digite 0, o sistema irá parar): ");
				    v = tarefas.nextInt();
				    trash = tarefas.nextLine(); // Consome a quebra de linha

				    // Verifica se o usuário não digitou 0 (comando de saída)
				    if (v != 0) {
				        // Subtraímos 1 porque o usuário digita "1" para a primeira tarefa, 
				        // mas no array ela está na posição "0".
				        tarefa[v - 1].concluida = true;
				    }

				} while(v != 0);

				// Exibição dos resultados
				System.out.print("\nA situação das suas tarefas é a seguinte:\n");

				for(int i = 0; i < q; i++) {
				    // Mantive a sua estrutura, mas você pode usar (i + 1) se quiser mostrar o número da tarefa na tela!
				    System.out.println("A tarefa " + (i + 1) + " (" + tarefa[i].Descricao + ") está: " + tarefa[i].concluida);
				}
		        break;
		        //
		        //ATIVIDADE 2
		        //
			case 2:
				//vou usar o mesmo quantificador do case 1
				//tipos de estudantes
				int fantasma=0; int iniciante=0; int focado=0; int atleta=0;
				//scanner e quantidade de estudantes
				Scanner academia = new Scanner(System.in);
				System.out.print("Quantos estudantes você vai cadastras?");
				q=academia.nextInt();
				trash=academia.nextLine();
				EstudanteAcademia[] estudante = new EstudanteAcademia[q];
				//for que define frequencias e nomes dos estudantes.
				for(int i=0;i<q;i++) {
					estudante[i]= new EstudanteAcademia();
					System.out.print("\nQual o nome desse Estudante?\n");
					estudante[i].nome=academia.nextLine();
					System.out.print("\nQual a frequência semanal desse estudante?\n");
					estudante[i].FrequenciaSemanal=academia.nextInt();
					trash = academia.nextLine();
					if(estudante[i].FrequenciaSemanal==0) {
						fantasma++;
					}else if(estudante[i].FrequenciaSemanal<=2){
						iniciante++;
					}else if(estudante[i].FrequenciaSemanal<=4) {
						focado++;
					}else {
						atleta++;
					}
					
				}
				System.out.printf("\nQuantidade de fantasma:"+fantasma+"\nQuantidade de iniciantes:"+iniciante+"\nQuantidade de focados:"+focado+"\nQuantidade de atletas:"+atleta);
				
				break;
			case 3:

				break;
			default:
				System.out.print("utilize um número de 1 a 3");
		}
//fechando o instanciador após o switch		
		instanciador.close();
	}

}

