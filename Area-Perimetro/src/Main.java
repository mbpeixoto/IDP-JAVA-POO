import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o tipo de figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Quadrado");
        System.out.println("3. Retângulo");
        System.out.println("4. Triângulo");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite o raio do círculo:");
                double raio = scanner.nextDouble();
                Circulo circulo = new Circulo(raio);
                operacaoGeometrica(circulo);
                break;

            case 2:
                System.out.println("Digite o lado do quadrado:");
                double lado = scanner.nextDouble();
                Quadrado quadrado = new Quadrado(lado);
                operacaoGeometrica(quadrado);
                break;

            case 3:
                System.out.println("Digite o comprimento do retângulo:");
                double comprimento = scanner.nextDouble();
                System.out.println("Digite a largura do retângulo:");
                double largura = scanner.nextDouble();
                Retangulo retangulo = new Retangulo(comprimento, largura);
                operacaoGeometrica(retangulo);
                break;

            case 4:
                System.out.println("Digite a base do triângulo:");
                double base = scanner.nextDouble();
                System.out.println("Digite a altura do triângulo:");
                double altura = scanner.nextDouble();
                Triangulo triangulo = new Triangulo(base, altura);
                operacaoGeometrica(triangulo);
                break;

            default:
                System.out.println("Escolha inválida.");
                break;
        }

        scanner.close();
    }

    public static void operacaoGeometrica(Object forma) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a operação:");
        System.out.println("1. Calcular a Área");
        System.out.println("2. Calcular o Perímetro");

        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                if (forma instanceof Circulo) {
                    Circulo circulo = (Circulo) forma;
                    System.out.println("Área do círculo: " + circulo.calcularArea());
                } else if (forma instanceof Quadrado) {
                    Quadrado quadrado = (Quadrado) forma;
                    System.out.println("Área do quadrado: " + quadrado.calcularArea());
                } else if (forma instanceof Retangulo) {
                    Retangulo retangulo = (Retangulo) forma;
                    System.out.println("Área do retângulo: " + retangulo.calcularArea());
                } else if (forma instanceof Triangulo) {
                    Triangulo triangulo = (Triangulo) forma;
                    System.out.println("Área do triângulo: " + triangulo.calcularArea());
                }
                break;

            case 2:
                if (forma instanceof Circulo) {
                    Circulo circulo = (Circulo) forma;
                    System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
                } else if (forma instanceof Quadrado) {
                    Quadrado quadrado = (Quadrado) forma;
                    System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
                } else if (forma instanceof Retangulo) {
                    Retangulo retangulo = (Retangulo) forma;
                    System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
                } else if (forma instanceof Triangulo) {
                    Triangulo triangulo = (Triangulo) forma;
                    System.out.println("Perímetro do triângulo: Não fornecido (informações insuficientes)");
                }
                break;

            default:
                System.out.println("Escolha inválida.");
                break;
        }

        scanner.close();
    }
}