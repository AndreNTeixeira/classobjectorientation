package calculovolumes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Volume volume = new Volume();

        System.out.println("O volume de um cubo é " +volume.calcularVolume(5));
        System.out.println("O volume de um paralelepipedo é " +volume.calcularVolume(5,4,3));
        System.out.println("O volume de um circulo é "+ volume.calcularVolume(4,3,true));

    }
}
