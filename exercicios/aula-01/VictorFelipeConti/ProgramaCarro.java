public class ProgramaCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.cor = "Azul";
        meuCarro.marca = "Ford";
        meuCarro.modelo = "Modelo T";
        meuCarro.ano = 1925;
        meuCarro.preco = 35000.0;

        System.out.println("=== Dados do carro ===");
        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.ano);
        System.out.println("Cor: " + meuCarro.cor);
        System.out.println("Preço: R$ " + meuCarro.preco);

        meuCarro.ligar();
        System.out.println("Está ligado? " + meuCarro.ligado);
        meuCarro.desligar();
        System.out.println("Está ligado? " + meuCarro.ligado);
    }
}
