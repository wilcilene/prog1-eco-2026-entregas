package exercsem1e2;

public class Exerc1 {
    String modelo;
    int velocidade;
    int nivelNitro; // 0 a 100

    void usarNitro() {
        if (nivelNitro > 0) {
            System.out.println("NITRO ATIVADO");
            nivelNitro = nivelNitro - 20;
            System.out.println("Nível de nitro agora: " + nivelNitro);
            if (nivelNitro <= 0) {
                System.out.println("O nitro acabou");
            }
        } else {
            System.out.println("Sem nitro disponível");
        }
    }


    public static void main(String[] args) {
        Exerc1 carro = new Exerc1();
        carro.modelo = "mustang";
        carro.velocidade = 150;
        carro.nivelNitro = 100;

        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Velocidade: " + carro.velocidade);
        System.out.println("Nitro inicial: " + carro.nivelNitro);

        carro.usarNitro();
        carro.usarNitro();
        carro.usarNitro();
    }
}


