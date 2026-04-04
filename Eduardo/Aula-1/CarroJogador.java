package FundamentosDaProgamacao;

public class CarroJogador {
	//exemplos de atributos
	String cor;
	String marca;
	String modelo;
	int ano;
	int nivelNitro;
	double preco;
	boolean ligado;
	
	//metódos do carro
	void ligar() {
		ligado =true;
		System.out.println("Carro ligado! :D");
	}
	void desligar() {
		ligado =false;
		System.out.println("Carro desligado! :(");
	}
	void usarNitro(){
		if(nivelNitro>9) {
			System.out.print("Nitro ativado!");
			nivelNitro=nivelNitro-10;
		}else {
			System.out.print("Este veículo não tem nitro suficiente, recarregue!!");
		}
	}
}

