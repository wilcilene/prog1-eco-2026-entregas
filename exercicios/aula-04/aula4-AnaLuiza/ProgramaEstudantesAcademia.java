import java.util.Scanner; 

class EstudantesAcademia {
    String nome; 
    int frequencia;
}

public class ProgramaEstudantesAcademia {
    public static void main(String[] agrs) {
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Quantos estudantes serão cadastrados?"); 
        int n = entrada.nextInt(); 
        entrada.nextLine(); 

        EstudantesAcademia[] estudantes = new EstudantesAcademia[n]; 

        int fantasma = 0, iniciantes = 0, focados = 0, atletas = 0; 

        for (int i = 0; i < n; i++) { 
            estudantes[i] = new EstudantesAcademia(); 

            System.out.println("Nome do estudante" + (i+1) + ": ");
            estudantes[i].nome = entrada.nextLine(); 
        
            System.out.println("Frequência semanal: "); 
            estudantes[i].frequencia = entrada.nextInt();
            entrada.nextLine(); 
            int f = estudantes[i].frequencia;

            if (f==0) {
                fantasma++; 
                System.out.println("Plano fantasma.");
            } else if (f<=2) {
                iniciantes++; 
                System.out.println("Modo iniciante."); 
                } else if (f<=4) {
                    focados++; 
                    System.out.println("Mode focado."); 
                } else {
                    atletas++; 
                    System.out.println("Modo atleta!"); 
                }
                System.out.println(); 
        }
        
        System.out.println("-Resumo da academia-"); 
        System.out.println("Plano fantasma: " + fantasma);
        System.out.println("Modo iniciante: " + iniciantes);
        System.out.println("Modo focado: "+ focados); 
        System.out.println("Modo atleta: "+ atletas); 

        entrada.close(); 
    }
}