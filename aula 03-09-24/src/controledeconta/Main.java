package controledeconta;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("André Nogueira", "48228");

       conta1.depositar(1000);

        System.out.println("Informações da conta");
        System.out.println("Titular da conta: " + conta1.getTitular());
        System.out.println("Numero da conta: " + conta1.getNumeroConta());
        System.out.println("Saldo da conta: " + conta1.getSaldo());
        System.out.println("Ativa? :" + conta1.getAtiva());
    }
}


