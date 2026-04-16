public class ProgramaCarro {
    
    public static void main(String[] args){

        CarroJogador meuCarro = new CarroJogador();

        meuCarro.modelo = "carro";
        meuCarro.marca = "marca";
        meuCarro.ano = 2000;
        meuCarro.nivelNitro = 120;

        meuCarro.usarNitro();

        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Ano: " + meuCarro.ano);
        System.out.println("Nivel de Nitro: " + meuCarro.nivelNitro);
    }
}
