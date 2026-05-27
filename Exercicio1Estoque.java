import java.util.Scanner;

public class Exercicio1Estoque {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== CADASTRO INICIAL DO PRODUTO ===");
        System.out.print("Nome do produto: ");
        String nome = input.nextLine();
        System.out.print("Preço do produto: ");
        double preco = input.nextDouble();
        System.out.print("Quantidade inicial em estoque: ");
        int qtdInicial = input.nextInt();

        // Criando o objeto produto
        Produto prod = new Produto(nome, preco, qtdInicial);

        // 1. Mostra os dados iniciais
        System.out.println("\n=== DADOS INICIAIS ===");
        prod.exibirDados();

        // 2. Realiza uma entrada no estoque
        System.out.print("\nDigite a quantidade para ENTRADA no estoque: ");
        int qtdEntrada = input.nextInt();
        prod.entradaEstoque(qtdEntrada);
        prod.exibirDados();

        // 3. Realiza uma saída no estoque
        System.out.print("\nDigite a quantidade para SAÍDA do estoque: ");
        int qtdSaida = input.nextInt();
        prod.saidaEstoque(qtdSaida);
        prod.exibirDados();

        input.close();
    }
}
