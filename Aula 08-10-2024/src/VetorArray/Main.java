package VetorArray;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //Arraylist<tipo> - > nome -> new ArrayList<tipo>();
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("Morango");
        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("Laranja");

        // o index coloca o elemento no lugar certo

        frutas.add(0,"Banana");



        //collections.sort para organizar da maneira que desejar
        //para ordem descrescente Collections.reverseorder

        Collections.sort(frutas);

        for (String elemento: frutas){
            System.out.println(elemento);
        }
    }
}
