class Automovel {
    String tipo;
    boolean estaLigado;
    boolean modoFantasma;

    void iniciar() {
        estaLigado = true;

        if (modoFantasma) {
            System.out.println("Um veículo misterioso surgiu silenciosamente...");
        } else {
            System.out.println("Veículo iniciado com sucesso.");
        }
    }

    void parar() {
        if (!estaLigado) {
            System.out.println("O veículo já está desligado.");
            return;
        }

        estaLigado = false;
        System.out.println("Veículo desligado.");
    }

    void mostrarStatus() {
        System.out.println("Modelo: " + tipo);
        System.out.println("Ligado: " + estaLigado);
        System.out.println("Modo fantasma: " + modoFantasma);
    }
}

public class SistemaVeiculos {
    public static void main(String[] args) {

        Automovel comum = new Automovel();
        comum.tipo = "City Line";
        comum.modoFantasma = false;

        Automovel misterioso = new Automovel();
        misterioso.tipo = "Shadow ZX";
        misterioso.modoFantasma = true;

        System.out.println("=== Teste veículo comum ===");
        comum.mostrarStatus();
        comum.iniciar();

        System.out.println("\n=== Teste veículo misterioso ===");
        misterioso.mostrarStatus();
        misterioso.iniciar();
    }
}