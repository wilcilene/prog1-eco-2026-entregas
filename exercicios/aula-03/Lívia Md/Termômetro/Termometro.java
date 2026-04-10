package Termômetro;

import java.util.Scanner;

public class Termometro{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Sala sala = new Sala();

        System.out.print("Nome da sala: ");
        sala.nome = entrada.nextLine();

        System.out.print("Temperatura atual: ");
        sala.temperatura = entrada.nextDouble();
        System.out.println("A sala " + sala.nome 
            + " tem a temperatura de: " + sala.temperatura + " ºC");
        if(sala.temperatura < 20){
            System.out.println("FRIO AAA");

        } else if(sala.temperatura <=25 ){
            System.out.println("Humm tá good");
        }else{
            System.out.println("QUENTE AAA");
        }
    }
}