import java.util.Scanner;

public class Exercicio3Triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Leitura do Triângulo X
        System.out.println("Digite as medidas dos lados do Triângulo X:");
        System.out.print("Lado a: "); double ax = input.nextDouble();
        System.out.print("Lado b: "); double bx = input.nextDouble();
        System.out.print("Lado c: "); double cx = input.nextDouble();
        Triangulo trianguloX = new Triangulo(ax, bx, cx);

        // Leitura do Triângulo Y
        System.out.println("\nDigite as medidas dos lados do Triângulo Y:");
        System.out.print("Lado a: "); double ay = input.nextDouble();
        System.out.print("Lado b: "); double by = input.nextDouble();
        System.out.print("Lado c: "); double cy = input.nextDouble();
        Triangulo trianguloY = new Triangulo(ay, by, cy);

        // Calculando as áreas chamando o método de cada objeto
        double areaX = trianguloX.calcularArea();
        double areaY = trianguloY.calcularArea();

        System.out.println("\n=== RESULTADO DAS ÁREAS ===");
        System.out.printf("Área do Triângulo X: %.4f\n", areaX);
        System.out.printf("Área do Triângulo Y: %.4f\n", areaY);
        System.out.println("---------------------------");

        // Verificando qual é o maior
        if (areaX > areaY) {
            System.out.println("O Triângulo X possui a MAIOR área.");
        } else if (areaY > areaX) {
            System.out.println("O Triângulo Y possui a MAIOR área.");
        } else {
            System.out.println("Ambos os triângulos possuem áreas IGUAIS.");
        }

        input.close();
    }
}
