package aula1308;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número a ser calculado");
        int numero = sc.nextInt();
        int padrao = 1;
        for (int i = numero; i > 1; i--) {
            padrao *= i;
        }
        System.out.println("O resultado é " +padrao);
    }
}
