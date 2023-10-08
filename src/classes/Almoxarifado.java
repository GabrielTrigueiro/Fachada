package classes;

import java.util.HashMap;
import java.util.Map;

public class Almoxarifado {
    private Map<String, Integer> estoque;

    public Almoxarifado() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(String produto, int quantidade) {
        if (estoque.containsKey(produto)) {
            int quantidadeAtual = estoque.get(produto);
            estoque.put(produto, quantidadeAtual + quantidade);
        } else {
            estoque.put(produto, quantidade);
            System.out.println("Produto " + produto + " adicionado ao estoque.");
        }
    }

    public Map<String, Integer> getEstoque() {
        return estoque;
    }

    public void setEstoque(Map<String, Integer> estoque) {
        this.estoque = estoque;
    }

    public void fazerPedidoCompra(String produto, int quantidade) {
        System.out.println("Pedido de compra: Produto - " + produto + ", Quantidade - " + quantidade);
        System.out.println();
    }

    public void verificarEstoque() {
        System.out.println("Produtos em estoque:");
        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            String produto = entry.getKey();
            int quantidade = entry.getValue();
            System.out.println(produto + ": " + quantidade);
        }
        System.out.println();
    }
}