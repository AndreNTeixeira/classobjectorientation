public class Carro extends Veiculo {

    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, int quantidadePortas) {
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }


    @Override
    public double calcularValorAluguel(int dias) {
        return (100 * dias) + (10 * quantidadePortas);
    }
}