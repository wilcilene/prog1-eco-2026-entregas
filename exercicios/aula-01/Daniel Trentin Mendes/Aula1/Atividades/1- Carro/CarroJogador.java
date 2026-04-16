public class CarroJogador {
    String modelo;
    String marca;
    int ano;
    int nivelNitro;

    void usarNitro(){
        if (nivelNitro >= 0 && nivelNitro <= 100){
            System.out.println("Nitro Ativado");
            nivelNitro = nivelNitro - 20;
            if (nivelNitro <= 0){
                System.out.println("Acabou o nitro");
            }
        }else {
            System.out.println("Valor insuficiente ou invalido");
        }
    }

}
