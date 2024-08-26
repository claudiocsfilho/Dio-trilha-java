package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String descricao) {
        dicionarioMap.put(palavra, descricao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("Não há palavras cadastradas!");
        }
    }

    public void exibirPalavra() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap.size());
            System.out.println(dicionarioMap);
        } else {
            System.out.println("Não há palavras cadastradas!");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraPesquisada = null;
        if (!dicionarioMap.isEmpty()) {
            palavraPesquisada = dicionarioMap.get(palavra);
        } else {
            System.out.println("Não há palavras cadastradas!");
        }
        return palavraPesquisada;
    }

    public static void main(String[] args) {
        Dicionario d = new Dicionario();

        d.adicionarPalavra("Carro", "Um tipo de veículo");
        d.adicionarPalavra("Porta", "Uma abertura por onde pessoas passam, abre e fecha");
        d.adicionarPalavra("Celular", "Aparelho que permite realizar ligações e conectar com a internet");
        d.adicionarPalavra("Corda", "Usado em diversas ocasiões");
        d.adicionarPalavra("Pássaro", "Um tipo de animal que possui asas e voa");

        d.exibirPalavra();
        d.removerPalavra("Porta");
        d.exibirPalavra();

        System.out.println(d.pesquisarPorPalavra("Carro"));
    }
}
