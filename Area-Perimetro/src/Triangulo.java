// Classe para representar um triângulo
class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return 0.5 * base * altura;
    }

    // Neste exemplo, não calcularemos o perímetro de um triângulo genérico,
    // pois é necessário mais informações (comprimento dos lados) para fazê-lo.
}

