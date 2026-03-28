package estudos;

public class TesteCarroJogador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        CarroJogador carro = new CarroJogador();

        carro.marca = "honda";
        carro.modelo = "civic";
        carro.ano = 2009;
        carro.nivelNitro = 20;

        carro.usarNitro();
        carro.usarNitro();
        carro.usarNitro();
    }

	}



