package questao2;

public class Retangulo implements Forma{
    double largura, altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    @Override
    public void desenhar() {
        System.out.println("Desenhando Retangulo");
    }

    @Override
    public double calcularArea() {
        double area = largura * altura;
        System.out.println("A Area do Retangulo " + area);
        return area;
    }

}
