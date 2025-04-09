package geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);

        Geometria g = new Geometria();
// utiliza o double porque as funções são double
        double x = calc.nextDouble();
        double y = calc.nextDouble();

        // lembrar de chamar o objeto g para calcular
        System.out.println("Area de um quadrado: " + g.calcularArea(x));
        System.out.println("Area de um retangulo: " + g.calcularArea(x,y));
        System.out.println("Area de um circulo: " + g.calcularArea(x,true));
    }
}