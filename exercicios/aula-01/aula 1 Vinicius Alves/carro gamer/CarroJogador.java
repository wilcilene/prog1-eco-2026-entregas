public class CarroJogador {
    String modelo;
    int velocidade;
    int nivelNitro; // 0 a 100

    void usarNitro() {
        if (nivelNitro > 0) {
            System.out.println("NITRO ATIVADO!");
            nivelNitro = nivelNitro - 20;
            System.out.println("Nível de nitro agora: " + nivelNitro);
            if (nivelNitro <= 0) {
                System.out.println("O nitro acabou!");
            }
        } else {
            System.out.println("Sem nitro disponível.");
        }
    }
}

public class ProgramaCarroJogador {
    public static void main(String[] args) {
        CarroJogador carro = new CarroJogador();
        carro.modelo = "Super Dev GT";
        carro.velocidade = 120;
        carro.nivelNitro = 60;

        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Velocidade: " + carro.velocidade);
        System.out.println("Nitro inicial: " + carro.nivelNitro);

        carro.usarNitro();
        carro.usarNitro();
        carro.usarNitro();
    }
}