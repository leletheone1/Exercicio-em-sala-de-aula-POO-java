public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Método para calcular o valor total em estoque
    public double calcularValorTotalEstoque() {
        return this.preco * this.quantidadeEstoque;
    }

    // Método para dar entrada no estoque
    public void entradaEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
            System.out.println("-> Entrada de " + quantidade + " unidades realizada.");
        }
    }

    // Método para dar saída no estoque com a validação pedida
    public void saidaEstoque(int quantidade) {
        if (quantidade > this.quantidadeEstoque) {
            System.out.println("-> ERRO: A quantidade informada (" + quantidade + " un) excede a quantidade disponível em estoque (" + this.quantidadeEstoque + " un)!");
        } else if (quantidade > 0) {
            this.quantidadeEstoque -= quantity;
            System.out.println("-> Saída de " + quantidade + " unidades realizada.");
        }
    }

    // Método para mostrar os dados do produto
    public void exibirDados() {
        System.out.println("----------------------------------------");
        System.out.println("Produto: " + this.nome);
        System.out.printf("Preço Unitário: R$ %.2f\n", this.preco);
        System.out.println("Quantidade em Estoque: " + this.quantidadeEstoque + " unidades");
        System.out.printf("Valor Total no Estoque: R$ %.2f\n", calcularValorTotalEstoque());
        System.out.println("----------------------------------------");
    }
}
