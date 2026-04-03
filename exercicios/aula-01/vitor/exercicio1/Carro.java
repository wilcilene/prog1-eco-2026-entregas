package exercicio1;

/*import java.util.Timer;
import java.util.TimerTask;

public class Carro {

    Timer temporizador = new Timer();
    String marca;
    String modelo;
    int ano;
    int nivel = 100;
    boolean ativado;
    void activeTurbo(){
        ativado = true;
        TurboTimer();
    }
    void disableTurbo() {
        ativado = false;
    }

    Void TurboTimer() {
        TimerTask task1 = new TimerTask();
        System.out.println("turbo ativado" + "   nivel atual:" + nivel);
        nivel = nivel - 10;
        if (nivel == 0) {
            disableTurbo();
            System.out.println("turbo desativado");
            temporizador.cancel();
        }

    }
    temporizador.scheduleAtFixedRate(task1, 0, 2000);
    }*/ import java.util.Timer;
import java.util.TimerTask;

public class Carro {

    Timer temporizador = new Timer();
    String marca;
    String modelo;
    int ano;
    int nivel = 100;
    boolean ativado;

    void activeTurbo() {
        ativado = true;
        TurboTimer();
    }

    void disableTurbo() {
        ativado = false;
    }

    void TurboTimer() {
        TimerTask task1 = new TimerTask() {
            public void run() {
                System.out.println("turbo ativado" + "   nivel atual:" + nivel);
                nivel = nivel - 10;

                if (nivel == 0) {
                    disableTurbo();
                    System.out.println("turbo desativado");
                    temporizador.cancel();
                }
            }
        };

        temporizador.scheduleAtFixedRate(task1, 0, 2000);
    }
}
