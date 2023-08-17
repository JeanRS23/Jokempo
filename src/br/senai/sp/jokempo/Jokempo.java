package br.senai.sp.jokempo;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;
import java.util.Scanner;

public class Jokempo {
    public static void main(String[] args) {

        int aleatorio;
        int number;
        String nome;
        boolean continuar = true;


        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Olá, Qual seu nome? ");
        nome = teclado.next();


        while (continuar) {


            System.out.println("Digite uma jogada, " + nome +" : [1-Pedra 2-Papel 3-Tesoura]");
            number = teclado.nextInt();

            aleatorio = random.nextInt(3) + 1;

            if (number == aleatorio) {
                System.out.println("Empate! ");
            } else if (number == 1 && aleatorio == 2 || number == 2 && aleatorio == 3) {
                System.out.println("Pc ganhou! ");
            } else {
                System.out.println("Você ganhou! ");
            }


            switch (aleatorio) {
                case 1:
                    System.out.println("Pc escolheu Pedra! ");
                    break;

                case 2:
                    System.out.println("Pc esolheu Papel! ");
                    break;

                case 3:
                    System.out.println("Pc esolheu Tesoura! ");
                    break;
            }
            System.out.println("----------------------------");
        }

    }
}
