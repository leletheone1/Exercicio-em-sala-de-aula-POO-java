public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método para aplicar o aumento baseado nas faixas salariais
    public double aplicarAumento() {
        double salarioAntigo = this.salario;
        double percentual = 0;

        if (this.salario >= 1 && this.salario <= 1000) {
            percentual = 0.15; // 15%
        } else if (this.salario >= 1001 && this.salario <= 1500) {
            percentual = 0.10; // 10%
        } else if (this.salario >= 1501 && this.salario <= 2000) {
            percentual = 0.05; // 5%
        }

        double aumento = this.salario * percentual;
        this.salario += aumento;

        return salarioAntigo; // Retorna o salário antigo para podermos imprimir depois
    }

    public String getNome() { return nome; }
    public double getSalario() { return salario; }
}
