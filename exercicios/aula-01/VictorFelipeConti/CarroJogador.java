public class CarroJogador {
    String modelo;
    int velocidade;
    int nivelNitro; // 0 a 100

    void usarNitro() {
        if (nivelNitro > 0) {
            System.out.println("NITRO AVANÇADO!");
            nivelNitro = nivelNitro - 20;
            System.out.println("Nivel de nitro agora: " + nivelNitro);
            if (nivelNitro <= 0) {
                System.out.println("O nitro acabou!");            
            }
        
    } else {
        System.out.println("Sem nitro disponível!");

       }
   }  
}