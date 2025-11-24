import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<ItemCarrinho> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    /**
     * Adiciona um produto ao carrinho.
     */
    public void adicionarItem(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            System.out.println(" A quantidade deve ser maior que zero.");
            return;
        }

        // Verifica se o produto já está no carrinho
        for (ItemCarrinho item : itens) {
            if (item.getProduto().equals(produto)) {
                // Se já estiver, apenas aumenta a quantidade
                int novaQuantidade = item.getQuantidade() + quantidade;
                // Cria um novo ItemCarrinho para simular a atualização
                this.itens.remove(item);
                this.itens.add(new ItemCarrinho(produto, novaQuantidade));
                System.out.println("✅ Produto adicionado novamente: " + produto.getNome() +
                        " (Total no carrinho: " + novaQuantidade + ")");
                return;
            }
        }

        // Se for a primeira vez que o produto é adicionado
        this.itens.add(new ItemCarrinho(produto, quantidade));
        System.out.println(" Produto adicionado: " + produto.getNome() +
                " (Quantidade: " + quantidade + ")");
    }

    /**
     * Calcula o valor total de todos os itens no carrinho.
     * @return O valor total do carrinho.
     */
    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    /**
     * Exibe o conteúdo atual do carrinho.
     */
    public void exibirCarrinho() {
        System.out.println("\n--- 🛒 Seu Carrinho de Compras ---");
        if (itens.isEmpty()) {
            System.out.println("O carrinho está vazio.");
            return;
        }

        for (ItemCarrinho item : itens) {
            System.out.printf("- %s | Qtd: %d | Subtotal: R$ %.2f\n",
                    item.getProduto().getNome(),
                    item.getQuantidade(),
                    item.calcularSubtotal());
        }
        System.out.printf("--- TOTAL: R$ %.2f ---\n", calcularTotal());
    }

    // Getter para a lista de itens (necessário para a Finalização de Compra)
    public List<ItemCarrinho> getItens() {
        return itens;
    }

    // Método para limpar o carrinho após a compra
    public void limparCarrinho() {
        this.itens.clear();
    }
}