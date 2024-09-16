package aumentodefuncionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Andre Nog", "Analista", 20000.00);

        System.out.println("Informações do Funcionário");
        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Cargo: " + funcionario1.cargo);
        System.out.println("Salario: " + funcionario1.getSalario());

        funcionario1.promover("Gerente", 5000.00);
        System.out.println("Informações do Funcionário");
        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Cargo: " + funcionario1.cargo);
        System.out.println("Salario: " + funcionario1.getSalario());

    }

}