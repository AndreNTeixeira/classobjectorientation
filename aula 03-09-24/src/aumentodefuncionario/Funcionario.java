package aumentodefuncionario;

public class Funcionario {
    public String nome;
    public String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        if (salario > 0) {
            this.salario = salario;
        } else {
            this.salario = 1000;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void promover(String novoCargo, double aumento) {
        if (aumento > 0) {
            setCargo(novoCargo);
            setSalario(getSalario() + aumento);
        } else {
            System.out.println("Informações Invalidas");
        }
    }
}