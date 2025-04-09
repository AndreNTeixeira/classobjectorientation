package geometria;

public class Geometria {

    //area quadrado
    public double calcularArea(double lado){
        return lado*lado;
    }
    //area retangulo
    public double calcularArea(double comprimento, double altura){
        return comprimento*altura;
    }

    //area circulo
    public double calcularArea(double raio, boolean isCircle){
        return Math.PI*raio*raio;
    }
}
