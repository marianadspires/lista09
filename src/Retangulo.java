public class Retangulo extends Quadrilatero {
    public Retangulo(double base, double altura) {
        super(base, altura, base, altura);
    }

    @Override
    public double calculaArea() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Retângulo [Base = " + lado1 + ", Altura = " + lado2 + "]";
    }
}


