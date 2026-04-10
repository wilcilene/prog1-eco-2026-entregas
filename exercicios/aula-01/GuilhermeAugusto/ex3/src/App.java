import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;

class Estudante{
    String nome;
    StringBuilder matricula;

    public Estudante(String nome, StringBuilder matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    void verDados(){
        System.out.println();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, StringBuilder> estudantes = new HashMap<>();
        Random r = new Random();
        boolean rodando = true;
        StringBuilder mat = new StringBuilder();

        while (rodando) {
            Scanner obj = new Scanner(System.in);

            System.out.println("[1] Novo estudante");
            System.out.println("[2] Ver estudante");
            System.out.println("[3] Sair");
            int opc = obj.nextInt();

            switch (opc) {
                case 1:

                    System.out.println("Nome:");
                    String nome = obj.next();

                    for(int i = 0; i < 9; i++){
                        mat.append(r.nextInt(9));
                    }
                    System.out.println("Matricula gerada: " + mat);

                    Estudante aluno = new Estudante(nome, mat);

                    estudantes.put(aluno.nome, aluno.matricula);
                    break;
                case 2:
                    System.out.println("Nome do estudante: ");
                    nome = obj.next();

                    if (estudantes.containsKey(nome)) {
                        System.out.println("Nome: " + nome);
                        System.out.println("Matricula: " + estudantes.get(nome));
                    }else{
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 3:
                    rodando = false;
                    break;
                default:
                    break;
            }
            obj.close();
        }
    }
}
