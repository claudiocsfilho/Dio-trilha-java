package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemMap.isEmpty()) {
            contagemMap.remove(palavra);
        } else {
            System.out.println("Não há palavras!");
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        if (!contagemMap.isEmpty()) {
            for (Integer i : contagemMap.values()){
                contagemTotal += i;
            }
        } else {
            System.out.println("Não há palavras!");
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        if (!contagemMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contagemMap.entrySet()){
                if (entry.getValue() > maiorContagem){
                    maiorContagem = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        } else {
            System.out.println("Não há palavras!");
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras cp = new ContagemPalavras();

        cp.adicionarPalavra("Palavra 1", 3);
        cp.adicionarPalavra("Palavra 6", 5);
        cp.adicionarPalavra("Palavra 5", 18);
        cp.adicionarPalavra("Palavra 3", 2);
        cp.adicionarPalavra("Palavra 2", 9);

        System.out.println("A contagem total de palavras é: " + cp.exibirContagemPalavras());

        cp.removerPalavra("Palavra 6");
        System.out.println("A contagem total de palavras é: " + cp.exibirContagemPalavras());

        System.out.println("A palavra mais frequente é: " + cp.encontrarPalavraMaisFrequente());
    }
}
