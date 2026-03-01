package java.produtos;

import java.contas.Calculos;

public class Produto {
    private String nome; private int quantidade;
    private float preco; private Calculos calculos;

    public Produto(String nome, int quantidade, float preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public int getQuantidade() { return quantidade;}

    public void setQuantidade(int quantidade) { this.quantidade = quantidade;}

    public float getPreco() { return preco;}

    public void setPreco(float preco) { this.preco = preco;}

    public double calculo () {
        return calculos.total();
    }

    @Override
    public String toString() {
        // Se calculos for null, total = 0
        double total = (calculos != null) ? calculos.total() : 0;

        // Retorna JSON formatado em uma linha
        return "{"
                + "\"nome\":\"" + nome + "\","
                + "\"quantidade\":" + quantidade + ","
                + "\"preco\":" + preco + ","
                + "\"total\":" + total
                + "}";
    }
}
