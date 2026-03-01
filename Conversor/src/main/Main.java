package main;

import java.produtos.Produto;
import java.produtos.SaveThatInformation;
import java.contas.Calculos;

public class Main {
    public static void main(String[] args) {

        // Criando java.informacoes.produtos
        Produto p1 = new Produto("Arroz", 5, 20.0f);
        Produto p2 = new Produto("Feijão", 3, 15.5f);
        Produto p3 = new Produto("Macarrão", 2, 8.0f);

        // Associando cálculo aos java.informacoes.produtos
        p1 = addCalculo(p1);
        p2 = addCalculo(p2);
        p3 = addCalculo(p3);

        // Criando lista para salvar informações
        SaveThatInformation lista = new SaveThatInformation();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        // Mostrando java.informacoes.produtos (CSV)
        System.out.println("Produtos no formato CSV:");
        for (Produto produto : lista.informacoes) {
            System.out.println(produto.toString());
        }

        // Testando busca
        System.out.println("\nBuscando produto 'Feijão':");
        System.out.println(lista.search(new Produto("Feijão", 0,0)));

        // Testando remoção
        lista.remove(p2);
        System.out.println("\nDepois de remover 'Feijão':");
        for (Produto produto : lista.informacoes) {
            System.out.println(produto.toString());
        }
    }

    // Método auxiliar para associar o Calculos ao Produto
    private static Produto addCalculo(Produto produto) {
        Calculos calc = new Calculos(produto);
        try {
            java.lang.reflect.Field f = Produto.class.getDeclaredField("calculos");
            f.setAccessible(true);
            f.set(produto, calc);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return produto;
    }
}