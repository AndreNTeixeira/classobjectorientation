package aula2008;
import java.util.Scanner;

public class Pessoa {

    public String nome, cidade;
    public int idade;

    public void exibirinformacoes(){
        System.out.println("Informações da Pessoa:");
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Cidade: " +cidade);
    }

    public void fazerAniversario(){
        System.out.println(nome + " fez Aniversário!");
        idade++;
    }
}
