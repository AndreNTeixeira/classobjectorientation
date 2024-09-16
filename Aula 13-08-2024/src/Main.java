import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("SISTEMA DE CALCULO DE MÉDIA");
        System.out.println("Informe o numero 1 ");
        float num1 = entrada.nextFloat();
        System.out.println("Informe o numero 2 ");
        float num2 = entrada.nextFloat();
        System.out.println("Informe o numero 3 ");
        float num3 = entrada.nextFloat();

        media = (num1+num2+num3)/3;
        System.out.println("A média é " + media );

    }

}