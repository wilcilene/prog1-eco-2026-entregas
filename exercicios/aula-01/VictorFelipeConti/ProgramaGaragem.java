public class ProgramaGaragem {
    public static void main(String[] args) {
        
        Garagem garagem = new Garagem();

        Carro carro1 = new Carro();
        carro1.modelo = "Fit";

        Carro carro2 = new Carro();
        carro2.modelo = "Corolla";

        Carro carro3 = new Carro();
        carro3.modelo = "Civic";

        garagem.adicionarCarro(carro1);
        garagem.adicionarCarro(carro2);
        garagem.adicionarCarro(carro3);

        garagem.listarCarros();
        garagem.ligarTodos();
    }
    
}
