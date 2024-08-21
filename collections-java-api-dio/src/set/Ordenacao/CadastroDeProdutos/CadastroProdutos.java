package set.Ordenacao.CadastroDeProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long cod, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); // uso o TreeSet porque ele consegue organizar o Set, com base no Comparable().
        // neste caso não usamos o Collections.sort pois o mesmo utiliza List, e o TreeSet já faz a organização que precisamos.
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cp = new CadastroProdutos();

        cp.adicionarProduto("Produto 1", 1L, 15d, 5);
        cp.adicionarProduto("Produto 3", 1L, 12d, 2);
        cp.adicionarProduto("Produto 6", 4L, 9d, 4);
        cp.adicionarProduto("Produto 2", 6L, 10d, 7);
        cp.adicionarProduto("Produto 8", 9L, 2d, 3);

        System.out.println(cp.produtoSet);

        System.out.println("Ordenando por Nome:\n" + cp.exibirProdutosPorNome());

        System.out.println("Ordenando por Preço:\n" + cp.exibirProdutosPorPreco());

    }
}
