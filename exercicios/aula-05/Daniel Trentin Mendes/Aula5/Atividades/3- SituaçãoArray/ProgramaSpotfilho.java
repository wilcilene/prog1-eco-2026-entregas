import java.util.Scanner;

public class ProgramaSpotfilho {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        Spotfilho[] app = new Spotfilho[3];


        int rock = 0;
        int pop = 0;
        int sertanejo = 0;
        int somaVisuR = 0;
        int somaVisuP = 0;
        int somaVisuS = 0;

        for(int i = 0; i < 3; i++){

            app[i] = new Spotfilho();
            System.out.println("================="+ (i + 1) +"=================");
            System.out.print("Escreva o nome da musica: ");
            app[i].musica = entrada.nextLine();

            System.out.print("Quantas view a musica tem?: ");
            app[i].visualização = entrada.nextInt();
            entrada.nextLine();
            if(app[i].visualização < 0){
                System.out.println("Valor incorreto, visualização setada para 0");
                app[i].visualização = 0;
            }

            System.out.println("De qual playlist essa musica pertence?");
            System.out.println("1- Rock");   
            System.out.println("2- Pop");
            System.out.println("3- Sertanejo");

            System.out.print("Digite o numero da playlist: ");
            int resp = entrada.nextInt();
            entrada.nextLine();

            if(resp == 1){
                app[i].playlist = "Rock";
                rock ++;
                somaVisuR += app[i].visualização;
            }else if(resp == 2){
                app[i].playlist = "Pop";
                pop ++;
                somaVisuP += app[i].visualização;
            }else if(resp == 3){
                app[i].playlist = "Sertanejo";
                sertanejo ++;
                somaVisuS += app[i].visualização;
            }else{
                System.out.println("Insira um valor valido");
                i--;
            }
        }

        
        for(int a = 0; a < 3; a++){

            System.out.println("-----------"+ (a + 1) +"-----------");
            System.out.println("Musica:" + app[a].musica);
            System.out.println("Visualização:" + app[a].visualização);
            System.out.println("Playlist:" + app[a].playlist);

        }

        System.out.println(".................Conclusão.................");   
        System.out.println("Quantidade de musica em cada playlist:");
        System.out.println("Rock: " + rock);  
        System.out.println("-------"); 
        System.out.println("Visualização do rock: " + somaVisuR); 
        System.out.println("Pop: " + pop);
        System.out.println("Visualização do pop: " + somaVisuP); 
        System.out.println("-------"); 
        System.out.println("Sertanejo: " + sertanejo);
        System.out.println("Visualização do sertanejo: " + somaVisuS); 


        entrada.close();
    }


}
