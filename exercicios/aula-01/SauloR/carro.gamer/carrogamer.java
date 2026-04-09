
public class carrogamer {
    public static void main(String[] args) {
        carrog carro = new carrog();
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