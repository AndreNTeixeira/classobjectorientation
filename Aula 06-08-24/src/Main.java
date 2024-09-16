public class Main {
    public static void main(String[] args) {
       Vaca josefina = new Vaca;
       josefina.nome = "Josefina";
       josefina.cor = "Amarela";
       josefina.peso = 127.65;
       josefina.gestante = true;
       josefina.idade = 15;
       josefina.comer(josefina.nome);

        System.out.println(josefina.cor); //colocar a variável da informação que voce deseja

        Vaca mimosa = new Vaca();
        mimosa.nome = "Mimosa";
        mimosa.cor = "Rosa";
        mimosa.peso = 330.45;
        mimosa.gestante = false;
        mimosa.idade = 7;
        mimosa.comer(mimosa.nome);

        /* //System.out.println("Hello world!");

        int sala = 9;
        String texto = "ADA";
        float numero = 3.14f;
        double dinheiro = 16.50;
        boolean estudar = true;

        /*
        igual ==
        diferente !=
        maior >
        menor <
        maiorigual >=
        menorigual <=


        if (sala == 89) {
            System.out.println(texto);
        } else {
            System.out.println("não estamos na turma ADA");
        }
        /*
        AND &&
        OR ||


        for (int i = 1; i <= sala; i++) {
            if (i == 9) {
                System.out.println("Estou na sala ADA");
            } else {
                System.out.println("Estou na sala: " + i);
            }

        }
    }
*/

}

static class Vaca{
        String nome;
        String cor;
    double peso;
    boolean gestante;
    int idade;


    void falar(){
        System.out.println("MUUUUUUU!");
    }
    void correr(){
        System.out.println("A Vaca esta correndo!");
    }
    void comer (){
        System.out.println("A Vaca esta comendo!");
    }

}