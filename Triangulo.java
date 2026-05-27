public class Triangulo {
    private double a;
    private double b;
    private double c;

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método que calcula a área usando a fórmula de Heron descrita na imagem
    public double calcularArea() {
        double p = (this.a + this.b + this.c) / 2.0;
        // Math.sqrt é usado para calcular a raiz quadrada em Java
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }
}
