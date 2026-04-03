public class Carro{
    String modelo;
    boolean ligado;
    boolean fantasma;
    void ligar(){
        ligado = true;
        if(fantasma) {
            System.out.println("O carro fantasma apareceu do nada!");
        }else{
            System.out.println("O carro foi ligado");
        }
    }
    void desligar(){
        ligado = false;
        System.out.println("O carro esta ligado");
    }
}