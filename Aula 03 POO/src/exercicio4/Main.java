package exercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int numero, i;

        System.out.println("Informe um numero");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();

        for (i =2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println("O número não é primo");
            }

        }

        System.out.println("O número é primo");
    }



    }

