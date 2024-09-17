package cadastroDeProdutos;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Agua";
        /*p1.preco = 20;*/
        p1.informacoes();
        p1.desconto = 15;
        p1.aplicarDesconto();
        p1.informacoes();
    }
}
