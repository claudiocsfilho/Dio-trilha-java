package list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoCompra;

    public CarrinhoDeCompras(){
        this.carrinhoCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompra.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i : carrinhoCompra){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        carrinhoCompra.removeAll(itemParaRemover);
    }

    public Double calcularValorTotal(){
        double soma = 0;
        for (Item s : carrinhoCompra){
            soma += (s.getPreco() * s.getQuantidade());
        }
        return soma;
    }

    public void exibirItem(){
        System.out.println(carrinhoCompra);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.exibirItem();

        carrinho.adicionarItem("sabonete", 4.90, 2);
        carrinho.adicionarItem("feijao", 7.54, 2);
        carrinho.adicionarItem("arroz", 29.90, 2);

        carrinho.exibirItem();
        System.out.println("Valor total R$" + carrinho.calcularValorTotal());

        carrinho.removerItem("feijao");
        carrinho.exibirItem();
        System.out.println("Valor total R$" + carrinho.calcularValorTotal());
    }
}
