package questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner Sc1 = new Scanner(System.in);

       Circulo C1 = new Circulo(10);
       Retangulo R1 = new Retangulo(5,10);
       Triangulo T1 = new Triangulo(7,6);

       C1.desenhar();
       C1.calcularArea();
       R1.desenhar();
       R1.calcularArea();
       T1.desenhar();
       T1.calcularArea();

    }
}
