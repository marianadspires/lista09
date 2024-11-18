public class Teste {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(4.0);
        Retangulo retangulo = new Retangulo(5.0, 3.0);


        System.out.println(quadrado);
        System.out.println("Área do Quadrado: " + quadrado.calculaArea());
        System.out.println("Perímetro do Quadrado: " + quadrado.calculaPerimetro());

        System.out.println();

        System.out.println(retangulo);
        System.out.println("Área do Retângulo: " + retangulo.calculaArea());
        System.out.println("Perímetro do Retângulo: " + retangulo.calculaPerimetro());
    }
}


