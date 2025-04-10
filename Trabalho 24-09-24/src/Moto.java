public class Moto extends Veiculo {
    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return (50 * dias) + (0.10 * cilindradas);
    }

}