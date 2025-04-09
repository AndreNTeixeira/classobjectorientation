package Vetor;

public class Main {
    public static void main(String[] args) {

        //tipo [] -> nome -> new tipo[10] tamanho do vetor
        //int numero = 10; pode ser criada a variável que define tamanho do vetor
        //vetor é como um conjunto de variáveis

        String[] nomes = {"André", "Pedro", "Edna", "Maria"};




        int[] notas = new int[5];
        notas[0] = 7;
        notas[1] = 8;
        notas[2] = 12;
        notas[3] = 77;
        notas[4] = 9;
        //notas[12]=55; ao colocar um número acima do tamanho do vetor

        //System.out.println(notas[0]); pra imprimir especificamente um

        System.out.println(notas.length);
       //notas.length para determinar o tamanho do vetor

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }



    }
}