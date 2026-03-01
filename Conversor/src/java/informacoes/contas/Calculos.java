package java.informacoes.contas;

import java.informacoes.produtos.Produto;

public class Calculos {

    private Produto produto;

    public Calculos(Produto produto) {
        this.produto = produto;
    }

    public double total() {
        return this.produto.getQuantidade() * produto.getPreco();
    }
}
