public class CarroJogador {
   String modelo;
   int nivelNitro;
   int velocidade;

   void usarNitro(){
      if (nivelNitro > 0){
         nivelNitro = nivelNitro -2;
         System.out.println("Nivek de nitro agora: "+ nivelNitro);
         if (nivelNitro <= 0) {
            System.out.println("Acabou kkkkk");
         }
      }
      else {
         System.out.println("Nem tem nitro fih");
      }
   }
   
}

