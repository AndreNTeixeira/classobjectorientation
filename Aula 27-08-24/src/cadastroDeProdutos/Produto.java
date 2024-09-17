package cadastroDeProdutos;

import java.sql.SQLOutput;

public class Produto {
    public String nome;
    private double preco;
    public double desconto;
    public double precofinal;

    public Produto(String nome, double preco, double desconto, double precofinal) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.precofinal = precofinal;

    }

    public void informacoes(){
        System.out.println("Informações do produto");
        System.out.println("Nome: " + nome);
        System.out.println("Valor: " + preco);
    }
    public void aplicarDesconto(){
        precofinal = preco - (preco*(desconto/100);
        System.out.println("Seu desconto é de " + desconto + "%");
        System.out.println("O valor do produto com desconto é de " + precofinal);
    }
}

