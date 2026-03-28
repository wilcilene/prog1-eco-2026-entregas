package poo.modelo;

public class CarroJogador {
	
	public	String marca;
	public String modelo;
	public	int ano;
	public int nivelNitro;
	
	public void usarNitro() {
		if(nivelNitro >0) {
			
			System.out.println("nitro ativado");
			nivelNitro = nivelNitro -10;
			
			System.out.println("nitro restante: " + nivelNitro);
		} else {
			
			System.out.println("nitro acabou");
		}
		
	}

}

