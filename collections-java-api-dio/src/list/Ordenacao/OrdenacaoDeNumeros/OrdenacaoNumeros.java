package list.Ordenacao.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    //atributos
    private List<Integer> numerosList;

    //construtor
    public OrdenacaoNumeros(){
        this.numerosList = new ArrayList<>();
    }

    //métodos
    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ordemAsc = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()){
            Collections.sort(ordemAsc);
        }else{
            System.out.println("A lista está vazia!");
        }
        return ordemAsc;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> ordemDesc = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()){
            Collections.sort(ordemDesc, Collections.reverseOrder());
        }else{
            System.out.println("A lista está vazia!");
        }
        return ordemDesc;
    }

    public void exibirNumeros(){
        System.out.println(numerosList);
    }


    public static void main(String[] args) {
        OrdenacaoNumeros ordenar = new OrdenacaoNumeros();

        ordenar.adicionarNumero(10);
        ordenar.adicionarNumero(4);
        ordenar.adicionarNumero(18);
        ordenar.adicionarNumero(92);
        ordenar.adicionarNumero(54);
        ordenar.adicionarNumero(65);

        ordenar.exibirNumeros();

        System.out.println("Ordem ascendente: " + ordenar.ordenarAscendente());
        System.out.println("Ordem descendente: " + ordenar.ordenarDescendente());
    }
}