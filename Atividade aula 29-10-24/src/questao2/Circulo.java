package questao2;

public class Circulo implements Forma{

    double raio;


    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void desenhar() {
        System.out.println("Isso é um circulo");
    }

    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area é " + area);
        return area;
        }

}
