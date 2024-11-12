package somadenumeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();
        int y = entrada.nextInt();
        int z = entrada.nextInt();

        Calculadora calculadora = new Calculadora();
        System.out.println("A soma dos 2 numeros é "+calculadora.somarNumeros(x,y));
        System.out.println("A soma dos 3 numeros é " + calculadora.somarNumeros(x,y,z));

    }
}
