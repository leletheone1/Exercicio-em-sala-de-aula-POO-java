import java.util.Scanner;

public class Exercicio2Salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = input.nextLine();
        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salario = input.nextDouble();

        Funcionario func = new Funcionario(nome, salario);

        // Aplica o aumento e guarda o valor que ele recebia antes
        double salarioAntigo = func.aplicarAumento();

        System.out.println("\n=== REAJUSTE SALARIAL ===");
        System.out.println("Funcionário: " + func.getNome());
        System.out.printf("Salário Antigo: R$ %.2f\n", salarioAntigo);
        System.out.printf("Salário Atual (com aumento): R$ %.2f\n", func.getSalario());

        input.close();
    }
}
