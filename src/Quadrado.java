public class Quadrado extends Quadrilatero {
    public Quadrado(double lado) {
        super(lado, lado, lado, lado);
    }

    @Override
    public double calculaArea() {
        return lado1 * lado1;
    }

    @Override
    public String toString() {
        return "Quadrado [Lado = " + lado1 + "]";
    }
}


