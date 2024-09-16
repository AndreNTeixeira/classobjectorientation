package aula1308;

import java.util.Scanner;

public class primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        int divisoes = 0;
        int i = 1;

        while (divisoes < 3 && i<= num) {
            if (num % i == 0) {
                System.out.println("É divisível por " + i);
                divisoes++;
            }
            i++;
        }
        if (divisoes < 3) {
            System.out.println("Seu número é primo");
        } else{
            System.out.println("Seu número não é primo");
        }
            }
        }
