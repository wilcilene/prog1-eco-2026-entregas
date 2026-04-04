package FundamentosDaProgamacao;

public class Main {
	public static void main(String[] args) {
	//instancia carro 0
	Mycar Carro = new Mycar();
	Carro.cor="verde";
	Carro.marca="Pejeut";
	Carro.modelo = "Modelistico 1992";
	Carro.ano = 2095;
	Carro.preco = 28999.00;
	//instancia carro 1
	Mycar Carro1 = new Mycar();
	Carro1.cor="azul";
	Carro1.marca="Forde";
	Carro1.modelo = "Modelistico 1853";
	Carro1.ano = 1854;
	Carro1.preco = 169999.00;
	Carro1.fantasma=false;
	//instancia carro 2
	Mycar Carro2 = new Mycar();
	Carro2.cor="amarelo";
	Carro2.marca="Frade";
	Carro2.modelo = "Modelistico 1542";
	Carro2.ano = 105423;
	Carro2.preco = 5399999.00;
	Carro2.fantasma=true;
	//instancia estudante
	Estudante estudante = new Estudante();
	estudante.Matricula="58438492394";
	estudante.Nome="Josefó Martinho De Marte";
	//instancia de livro
	Livro livro = new Livro();
	livro.autor = "Marcos";
	livro.paginas = 59;
	livro.titulo = "livro do Marcos";
	//musica
	Musica musica = new Musica();
	musica.artista = "robervaldo";
	musica.titulo = "robervaldo";
	musica.duracaoEmSegundos=888;
	//musica 1
	Musica musica1 = new Musica();
	musica1.artista = "rovervaldo";
	musica1.titulo = "rovervaldo's song";
	musica1.duracaoEmSegundos=555;
	//Consulta.
	//as duas musicas pq n ligo mais, lol
	System.out.print("\n\n\n"+musica.artista+musica1.artista+musica.titulo+musica1.titulo);
	musica1.titulo="marmota";
	System.out.print(musica1.titulo);
	//livro
	System.out.print("\n O autor "+ livro.autor+" criou o livro "+livro.titulo+" com "+livro.paginas+" páginas");
	livro.paginas = 88;
	System.out.print("\n O autor "+ livro.autor+" criou o livro "+livro.titulo+" com "+livro.paginas+" páginas");
	//estudante
	System.out.println("\n\ninformações sobre o estudante:");
	System.out.println("Nome:"+estudante.Nome);
	System.out.println("Matricula:"+estudante.Matricula);
	//carro 0
	System.out.println("\n\nInformações sobre o veículo 1:");
	System.out.println("Marca:"+ Carro.marca);
	System.out.println("Modelo:"+ Carro.modelo);
	System.out.println("Cor:"+ Carro.cor);
	System.out.println("Ano:"+ Carro.ano);
	System.out.println("Preço:"+ Carro.preco);
	System.out.println("o veículo está ligado? ");Carro.desligar();
	//carro 2
	System.out.println("\n\nInformações sobre o veículo 2:");
	System.out.println("Marca:"+ Carro1.marca);
	System.out.println("Modelo:"+ Carro1.modelo);
	System.out.println("Cor:"+ Carro1.cor);
	System.out.println("Ano:"+ Carro1.ano);
	System.out.println("Preço:"+ Carro1.preco);
	System.out.println("o veículo está ligado? ");Carro1.ligar();
	//carro 3
	System.out.println("\n\nInformações sobre o veículo 3:");
	System.out.println("Marca:"+ Carro2.marca);
	System.out.println("Modelo:"+ Carro2.modelo);
	System.out.println("Cor:"+ Carro2.cor);
	System.out.println("Ano:"+ Carro2.ano);
	System.out.println("Preço:"+ Carro2.preco);
	System.out.println("o veículo está ligado? ");Carro2.ligar();

	
	
	}
}
