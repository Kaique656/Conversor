package java.produtos;

import java.util.ArrayList;
import java.util.List;

public class SaveThatInformation {
    public List<Produto> informacoes; Produto produto;

    public SaveThatInformation() {
        this.informacoes = new ArrayList<>();
    }
    public void add (Produto p) {
        informacoes.add(p);
    }
    public void remove(Produto p) throws IllegalArgumentException {
        try {
            informacoes.remove(p);
        } catch (Exception e) {
            throw  new IllegalArgumentException("O produto não exista para ser apagado");
        }
    }

    public String search (Produto p) {
        try {
            for (Produto produto1:informacoes) {
                if (produto1.getNome().equalsIgnoreCase(p.getNome())){
                    return "Produto 1 : " + produto1.getNome();
                }
            }
        } catch (Exception e ) {
            throw new IllegalArgumentException(e.getCause());
        }
        return "O pruduto nao foi achado";
    }


}
