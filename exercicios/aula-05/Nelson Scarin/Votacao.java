package entrega4;

import java.util.Scanner;

 class SistemaVotacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Array para armazenar os votos de 3 candidatos
        // candidato[0], candidato[1] e candidato[2]
        int[] candidatos = new int[3];
        
        System.out.println("=== Sistema de Votação Simples ===");
        System.out.println("Vote 0, 1 ou 2. Digite -1 para encerrar.");

        int voto = 0;

        // Loop para receber votos até que o usuário digite -1
        while (voto != -1) {
            System.out.print("Informe seu voto: ");
            voto = entrada.nextInt();

            if (voto >= 0 && voto < 3) {
                // Incrementa o voto na posição do array correspondente ao candidato
                candidatos[voto] = candidatos[voto] + 1;
                System.out.println("Voto computado!");
            } else if (voto != -1) {
                System.out.println("Candidato inválido!");
            }
        }

        System.out.println("\n=== Resultado da Apuração ===");
        // Usamos um for simples para ler os resultados do array
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato " + i + ": " + candidatos[i] + " votos");
        }

        entrada.close();
    }
}