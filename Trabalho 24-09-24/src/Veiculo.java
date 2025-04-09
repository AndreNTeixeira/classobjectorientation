public abstract class Veiculo {

    private String marca, modelo;
    private int ano;
    private boolean alugado;
    double aluguel;

    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.alugado = false;
    }


    public void alugar() {
        if (!alugado) {
            this.alugado = true;
            System.out.println(modelo + "foi alugado com sucesso");
        } else {
            System.out.println("O Veiculo já está alugado");
        }
    }

    public void devolver(){
        if (alugado){
            this.alugado = false;
            System.out.println(modelo + "Foi devolvido com sucesso");
        }else {
            System.out.println("O veículo já está disponivel!");
        }
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean getAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public abstract double calcularValorAluguel(int dias);

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
