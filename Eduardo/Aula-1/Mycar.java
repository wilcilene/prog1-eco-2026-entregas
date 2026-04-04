package FundamentosDaProgamacao;
public class Mycar {
	//exemplos de atributos
	String cor;
	String marca;
	String modelo;
	int ano;
	double preco;
	boolean ligado;
	boolean fantasma;
	//metódos do carro
	void ligar() {
		if(fantasma==true) {
			ligado=true;
			System.out.print("O carro apareceu donada!"); 
		}else {
		ligado =true;
		System.out.println("Carro ligado! :D");}
	}
	void desligar() {
		ligado =false;
		System.out.println("Carro desligado! :(");
	}
}