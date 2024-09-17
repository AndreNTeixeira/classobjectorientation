package exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " É Par");
        }else if (numero % 2 != 0) {
            System.out.println(numero + " É Impar");
        }

    }
}
