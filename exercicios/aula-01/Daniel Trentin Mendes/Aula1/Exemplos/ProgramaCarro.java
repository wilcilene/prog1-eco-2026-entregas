public class ProgramaCarro{

    public static void main(String[] args){

        Carro meuCarro = new Carro();
        meuCarro.cor = "Azul";
        meuCarro.marca = "Ford";
        meuCarro.modelo = "Modelo T";
        meuCarro.ano = 1925;
        meuCarro.preco = 35000.0;

        System.out.println("=== Dados do Carro 1 ===");
        System.out.println("Marca:" + meuCarro.marca);
        System.out.println("Modelo: "+ meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.ano);
        System.out.println("Cor: " + meuCarro.cor);
        System.out.println("Preço: " + meuCarro.preco);

        meuCarro.ligar();
        System.out.println("Está ligado?" + meuCarro.ligado);

        meuCarro.desligar();
        System.out.println("Está desligado?" + meuCarro.ligado);

    Carro meuCarro2 = new Carro();
        meuCarro2.cor = "Preto";
        meuCarro2.marca = "Dell";
        meuCarro2.modelo = "Modelo A";
        meuCarro2.ano = 2027;
        meuCarro2.preco = 250.0;

        System.out.println("=== Dados do Carro 2 ===");
        System.out.println("Marca:" + meuCarro2.marca);
        System.out.println("Modelo: "+ meuCarro2.modelo);
        System.out.println("Ano: " + meuCarro.ano);
        System.out.println("Cor: " + meuCarro2.cor);
        System.out.println("Preço: " + meuCarro2.preco);

        meuCarro2.ligar();
        System.out.println("Está ligado?" + meuCarro2.ligado);

        meuCarro2.desligar();
        System.out.println("Está desligado?" + meuCarro2.ligado);


       Carro meuCarro3 = new Carro();
        meuCarro3.cor = "Cinza";
        meuCarro3.marca = "Ulala";
        meuCarro3.modelo = "Modelo G";
        meuCarro3.ano = 1005;
        meuCarro3.preco = 2.0;

        System.out.println("=== Dados do Carro 3 ===");
        System.out.println("Marca:" + meuCarro3.marca);
        System.out.println("Modelo: "+ meuCarro3.modelo);
        System.out.println("Ano: " + meuCarro3.ano);
        System.out.println("Cor: " + meuCarro3.cor);
        System.out.println("Preço: " + meuCarro3.preco);

        meuCarro3.ligar();
        System.out.println("Está ligado?" + meuCarro.ligado);

        meuCarro3.desligar();
        System.out.println("Está desligado?" + meuCarro.ligado); 
    }

    
}