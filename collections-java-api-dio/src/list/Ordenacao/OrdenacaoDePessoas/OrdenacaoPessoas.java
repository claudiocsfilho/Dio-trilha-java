package list.Ordenacao.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    // método para ordenar por idade utilizando a interface Comparable
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade); //Collections.sort vai ordenar a array recebida nesta nova array, com base na interface comparable
        return pessoasPorIdade;
    }

    //método para ordenar por altura utilizando a interface Comparator
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorporAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("nome 1", 18, 1.75);
        ordenacaoPessoas.adicionarPessoa("nome 2", 29, 1.60);
        ordenacaoPessoas.adicionarPessoa("nome 3", 23, 1.65);
        ordenacaoPessoas.adicionarPessoa("nome 4", 43, 1.83);

        System.out.println("Ordenando por Idade:\n" + ordenacaoPessoas.ordenarPorIdade());
        System.out.println("Ordenando por Altura:\n" + ordenacaoPessoas.ordenarPorAltura());
    }

}
