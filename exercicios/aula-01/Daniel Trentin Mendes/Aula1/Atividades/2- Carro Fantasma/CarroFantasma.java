public class CarroFantasma {
    
    String modelo;
    String marca;
    String cor;
    int ano;
    boolean fantasma;
    boolean ligado;

    void ligar(){
        ligado = true;
        if (fantasma){
            System.out.println("Carro fantasma apareceu do nada!");
        }else {
            System.out.println("Carro Ligado");
        }
    }
}
