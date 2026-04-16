public class ProgramaCarroFantasma {
    
    public static void main(String[] args){

        CarroFantasma meuCarro = new CarroFantasma();

        meuCarro.modelo = "Carro";
        meuCarro.marca = "Marca";
        meuCarro.ano = 2000;
        meuCarro.fantasma = false;

        

        System.out.println("=========Carro 1 =========");
        meuCarro.ligar();
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Ano: " + meuCarro.ano);

        CarroFantasma meuCarro2 = new CarroFantasma();

        meuCarro2.modelo = "Carro";
        meuCarro2.marca = "Marca";
        meuCarro2.ano = 2000;
        meuCarro2.fantasma = true;

        

        System.out.println("=========Carro 2 =========");
        meuCarro2.ligar();
        System.out.println("Modelo: " + meuCarro2.modelo);
        System.out.println("Marca: " + meuCarro2.marca);
        System.out.println("Ano: " + meuCarro2.ano);
    }

}
