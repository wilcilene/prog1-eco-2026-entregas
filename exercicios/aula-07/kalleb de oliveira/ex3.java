import java.util.Scanner;
import java.util.Locale;

class SessaoEstudo {
    String nomeDia;
    int tempoMinutos;
}

public class ControleEstudos {

    public static void main(String[] args) {
        // Configuração do Scanner com Locale para evitar conflitos de região
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        SessaoEstudo[] gradeSemanal = new SessaoEstudo[7];
        String[] diasRotulo = {
            "Segunda-feira", "Terça-feira", "Quarta-feira", 
            "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"
        };

        int somaTotalMinutos = 0;
        SessaoEstudo diaDestaque = null;

        // --- Fase de Coleta de Dados ---
        for (int i = 0; i < gradeSemanal.length; i++) {
            SessaoEstudo registro = new SessaoEstudo();
            registro.nomeDia = diasRotulo[i];

            System.out.print("Minutos dedicados na " + diasRotulo[i] + ": ");
            registro.tempoMinutos = sc.nextInt();

            gradeSemanal[i] = registro;
            somaTotalMinutos += registro.tempoMinutos;

            // Lógica para determinar o dia com maior tempo de estudo
            if (diaDestaque == null || registro.tempoMinutos > diaDestaque.tempoMinutos) {
                diaDestaque = registro;
            }
        }

        // --- Exibição do Relatório ---
        System.out.println("\n---------------------------------");
        System.out.println("      BALANÇO DA SEMANA          ");
        System.out.println("---------------------------------");
        
        System.out.println("Tempo total: " + somaTotalMinutos + " min");
        
        if (diaDestaque != null) {
            System.out.println("Maior foco em: " + diaDestaque.nomeDia);
            System.out.println("Tempo recorde: " + diaDestaque.tempoMinutos + " min");
        }
        
        System.out.println("---------------------------------");

        sc.close();
    }
}