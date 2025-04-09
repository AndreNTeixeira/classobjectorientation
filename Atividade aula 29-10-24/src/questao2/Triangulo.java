package questao2;

public class Triangulo implements Forma {
    double base, alturaTri;

    public Triangulo(double base, double alturaTri) {
        this.base = base;
        this.alturaTri = alturaTri;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando Triangulo");
    }

    @Override
    public double calcularArea() {
        double area;
        area = base*alturaTri;
        System.out.println("A area do triangulo é " + area);

        return area;
    }
}
