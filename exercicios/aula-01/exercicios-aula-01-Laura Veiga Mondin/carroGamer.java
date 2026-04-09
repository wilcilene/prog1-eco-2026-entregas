public class CarroGamer {
    
    String cor;
    String modelo;
    String marca;
    int ano;
    float preco;
    boolean ligado;

    void ligar(){
        ligado = true;
        System.out.println("Carro ligado.");

    }

    void desligar(){
        ligado = false;
        System.out.println("Carro desligado");
    }

    void ligarNitro(){
        System.out.println("Nitro ativado!");
    }

    void metadeNitro(){
        System.out.println("Nitro acabando.");
    }

    void fimNitro(){
        System.out.println("Sem nitro.");
    }

}
