package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        if (!estoqueProdutosMap.isEmpty()) {
            System.out.println(estoqueProdutosMap);
        }else {
            System.out.println("O estoque está vazio!");
        }
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade()*p.getPreco();
            }
        }else {
            System.out.println("Estoque vazio");
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }else {
            System.out.println("Estoque vazio");
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }else {
            System.out.println("Estoque vazio");
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQtdade = null;
        double maiorQtdade = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p: estoqueProdutosMap.values()){
                if ((p.getPreco()*p.getQuantidade() > maiorQtdade)){
                    produtoMaiorQtdade = p;
                    maiorQtdade = p.getPreco() * p.getQuantidade();
                }
            }

        }else {
            System.out.println("Estoque vazio");
        }
        return produtoMaiorQtdade;
    }

    public static void main(String[] args) {
        EstoqueProdutos ep = new EstoqueProdutos();

        ep.adicionarProduto(1L, "Prato", 15, 5.5);
        ep.adicionarProduto(2L, "Garfo", 20, 2.5);
        ep.adicionarProduto(3L, "Copo", 10, 5);
        ep.adicionarProduto(4L, "Faca", 25, 2.75);
        ep.adicionarProduto(5L, "Colher", 23, 2.1);

        ep.exibirProdutos();
        System.out.println("Valor total do estoque: " + ep.calcularValorTotalEstoque());
        System.out.println("O produto mais caro é: " + ep.obterProdutoMaisCaro());
        System.out.println("O produto mais barato é: " + ep.obterProdutoMaisBarato());
        System.out.println("O produto com estoque de maior valor é: " + ep.obterProdutoMaiorQuantidadeValorTotalNoEstoque());



    }

}
