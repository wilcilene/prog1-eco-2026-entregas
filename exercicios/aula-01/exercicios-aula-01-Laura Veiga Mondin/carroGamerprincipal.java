//EXERCÍCIO 1 E 2 

public class carroGamerprincipal{
    public static void main(String[] args) {
        
        CarroGamer carro = new CarroGamer();

        carro.cor = "preto";
        carro.modelo = "A5";
        carro.marca = "Audi";
        carro.ano = 2025;
        carro.preco = 200000;

        System.out.println("=== Dados do carro ===");
        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Cor: " + carro.cor);
        System.out.println("Preço: R$ " + carro.preco);

        carro.ligar();

        carro.ligarNitro();

        carro.metadeNitro();

        carro.fimNitro();

        carro.desligar();

}

}