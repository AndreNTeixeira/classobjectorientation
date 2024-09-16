package testePessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(  "José",123);
   p1.nome = "José";
   p1.salario = 2100;
   p1.informacoes();
   p1.mudarCpf(456);
   p1.subirDeCargo();
   p1.informacoes();

    }

}