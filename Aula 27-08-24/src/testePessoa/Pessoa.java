package testePessoa;

public class Pessoa {
    public String nome;
    private  int cpf;
    protected double salario;

    //construtor para modificar o privado
    public Pessoa(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    //função para modificar parametro já inserido
    public void mudarCpf(int cpf){
        this.cpf = cpf;
    }

    public void informacoes(){
        System.out.println("Informações da pessoa");
        System.out.println("Nome: " +nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salario: "+ salario);
        System.out.println("  ");
    }
    //função privada não aceita o acesso da main
    private void aumentarSalario(){
        salario +=500;
    }
    //função para utilizar private por estar na mesma estrutura
    public void subirDeCargo(){
        System.out.println("Parabens você subiu de cargo!");
        aumentarSalario();
    }
}
