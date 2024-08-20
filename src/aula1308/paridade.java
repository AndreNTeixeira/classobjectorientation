package aula1308;

import java.util.Scanner;

public class paridade {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("Digite um número");
        int num1 = calc.nextInt();
        if (num1 ==0){
            System.out.println("O número é nulo");
        }
        else {
            if (num1 % 2 == 0) {
                System.out.println("Esse número é par");
            } else {
                System.out.println("Esse número é impar");
            }
        }
    }
}
