package set.OperacoesBasicas.ConjuntoDePalavrasUnicas;

import set.OperacoesBasicas.ConjuntoDeConvidados.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas (){
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraRemover = null;
        if(!palavrasSet.isEmpty()){
            if (palavrasSet.contains(palavra)){
                palavrasSet.remove(palavra);
            }else{
                System.out.println("Palavra não encontrada no conjunto");
            }
        }else {
            System.out.println("O conjunto está vazio");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavra(){
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas pu = new ConjuntoPalavrasUnicas();

        pu.adicionarPalavra("tatu");
        pu.adicionarPalavra("caco");
        pu.adicionarPalavra("amor");
        pu.adicionarPalavra("calor");
        pu.adicionarPalavra("vapor");

        pu.exibirPalavra();
        pu.removerPalavra("caco");
        pu.exibirPalavra();

        System.out.println("A palavra 'amor' está no conjunto? " + pu.verificarPalavra("amor"));
        System.out.println("A palavra 'oca' está no conjunto? " + pu.verificarPalavra("oca"));
        System.out.println("A palavra 'tatu' está no conjunto? " + pu.verificarPalavra("tatu"));

        pu.removerPalavra("tatu");
        System.out.println("A palavra 'vapor' está no conjunto? " + pu.verificarPalavra("vapor"));
        pu.exibirPalavra();
    }
}