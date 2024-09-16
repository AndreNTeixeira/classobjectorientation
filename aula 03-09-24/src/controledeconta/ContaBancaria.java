package controledeconta;

public class ContaBancaria {
    public String titular;
    public String numeroConta;
    private double saldo;
    private boolean ativa;

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.ativa = true;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public void depositar(double valor) {
        if(getAtiva()){
            if (valor > 0){
                setSaldo(getSaldo() + valor);
            }else {
                System.out.println("Valor de depósito invalido");
            }
        }
        else {
            System.out.println("Não é possivel depositar em contas desativadas");
        }
    }
    public void ativarConta(){
        this.ativa = true;
    }
    public void desativarConta(){
        this.ativa = false;
    }
}