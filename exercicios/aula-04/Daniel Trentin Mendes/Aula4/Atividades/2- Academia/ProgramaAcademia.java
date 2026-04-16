import java.util.Scanner;

public class ProgramaAcademia {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos frequentadores você quer cadastrar?: ");
        int n = entrada.nextInt();

        Academia[] tabela = new Academia[n];

        entrada.nextLine(); //Desbugar int pulando linha /n

        for (int i = 0; i < n; i++){

            System.out.println("======================= " + (i + 1) + "º aluno =======================");
            tabela[i] = new Academia();

            System.out.print("Nome: ");
            tabela[i].nome = entrada.nextLine();

            System.out.print("Quantos dias a pessoa vem por semana: ");
            tabela[i].frequenciaSemanal = entrada.nextInt();
            entrada.nextLine(); //Desbugar int pulando linha /n
            if (tabela[i].frequenciaSemanal < 0 || tabela[i].frequenciaSemanal > 7){
                System.out.println("Coloque a frequencia semanal correta");
                i --;
            }

        }

        int pf = 0;
        int mi = 0;
        int mf = 0;
        int ma = 0;

        System.out.println(".................... Tabela Completa ....................");

        for (int a = 0; a < n; a++){

            if (tabela[a].frequenciaSemanal == 0){
                System.out.println("");
                System.out.println("Nome: " + tabela[a].nome );
                System.out.println("Classificação: Plano Fantasma");
                pf ++;
            }else if (tabela[a].frequenciaSemanal >= 1 && tabela[a].frequenciaSemanal <= 2){
                System.out.println("");
                System.out.println("Nome: " + tabela[a].nome );
                System.out.println("Classificação: Modo Iniciante");
                mi ++;
            }else if (tabela[a].frequenciaSemanal >= 3 && tabela[a].frequenciaSemanal <= 4){
                System.out.println("");
                System.out.println("Nome: " + tabela[a].nome );
                System.out.println("Classificação: Modo Focado");
                mf ++;
            }else if (tabela[a].frequenciaSemanal > 5){
                System.out.println("");
                System.out.println("Nome: " + tabela[a].nome );
                System.out.println("Classificação: Modo Atleta");
                ma ++;
            }

            
            
        }

        System.out.println("-----------------------------------------------");
            System.out.println("Plano fantasma: " + pf);
            System.out.println("Modo Iniciante: " + mi);
            System.out.println("Modo Focado: " + mf);
            System.out.println("Modo Atleta: " + ma);

        entrada.close();
    }

}
