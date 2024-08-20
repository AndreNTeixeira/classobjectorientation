import aula2008.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Junior";
        pessoa1.idade = 18;
        pessoa1.cidade = "Teresina";

        System.out.println("Digite o nome da pessoa");
        pessoa2.nome = entrada.nextLine();
        System.out.println("Digite a idade da pessoa");
        pessoa2.idade = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite a cidade da pessoa");
        pessoa2.cidade  = entrada.nextLine();

        pessoa1.exibirinformacoes();
        pessoa1.fazerAniversario();
        pessoa1.exibirinformacoes();

        pessoa2.exibirinformacoes();
        pessoa2.fazerAniversario();
        pessoa2.exibirinformacoes();



    }

}