package map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrariaMap;

    public LivrariaOnline() {
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livrariaMap.put(link, livro);
    }

    public void removerLivro(String titulo) {
        List<String> livroRemover = new ArrayList<>();
        if (!livrariaMap.isEmpty()) {
            for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    livroRemover.add(entry.getKey());
                }
            }
            for (String livro : livroRemover){
                livrariaMap.remove(livro);
            }
        } else {
            System.out.println("Não há livros cadastrados!");
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livroPorPreco = new ArrayList<>(livrariaMap.entrySet());
        Collections.sort(livroPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livroOrdPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livroPorPreco){
            livroOrdPreco.put(entry.getKey(), entry.getValue());
        }
        return livroOrdPreco;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor(){
        List<Map.Entry<String, Livro>> livroPorAutor = new ArrayList<>(livrariaMap.entrySet());
        Collections.sort(livroPorAutor, new ComparatorPorAutor());

        Map<String, Livro> livroOrdAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livroPorAutor){
            livroOrdAutor.put(entry.getKey(), entry.getValue());
        }
        return livroOrdAutor;
    }

    public List<Livro> obterLivroMaisCaro(){
        List<Livro> livroMaisCarolist = new ArrayList<>();
        double livroMaisCaro = Double.MIN_VALUE;

        if (!livrariaMap.isEmpty()){
            for (Livro l : livrariaMap.values()){
                if (l.getPreco() > livroMaisCaro){
                    livroMaisCaro = l.getPreco();
                }
            }
        }else {
            throw new NoSuchElementException("A livraria está vazia");
        }

        for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
            if (entry.getValue().getPreco() == livroMaisCaro){
                Livro livroCaroFor = livrariaMap.get(entry.getKey());
                livroMaisCarolist.add(livroCaroFor);
            }
        }
        return livroMaisCarolist;
    }

    public List<Livro> obterLivroMaisBarato(){
        List<Livro> livroMaisBaratolist = new ArrayList<>();
        double livroMaisBarato = Double.MAX_VALUE;

        if (!livrariaMap.isEmpty()){
            for (Livro l : livrariaMap.values()){
                if (l.getPreco() < livroMaisBarato){
                    livroMaisBarato = l.getPreco();
                }
            }
        }else {
            throw new NoSuchElementException("A livraria está vazia");
        }

        for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
            if (entry.getValue().getPreco() == livroMaisBarato){
                Livro livroBaratoFor = livrariaMap.get(entry.getKey());
                livroMaisBaratolist.add(livroBaratoFor);
            }
        }
        return livroMaisBaratolist;
    }



    public static void main(String[] args) {
        LivrariaOnline lo = new LivrariaOnline();

        lo.adicionarLivro("Link 1", new Livro("Livro 1", "Autor 1", 27d));
        lo.adicionarLivro("Link 2", new Livro("Livro 2", "Autor 2", 22d));
        lo.adicionarLivro("Link 3", new Livro("Livro 3", "Autor 1", 29d));
        lo.adicionarLivro("Link 4", new Livro("Livro 4", "Autor 3", 20d));

        System.out.println(lo.obterLivroMaisBarato());
        System.out.println(lo.obterLivroMaisCaro());

        System.out.println(lo.exibirLivrosOrdenadosPorAutor());
        System.out.println(lo.exibirLivrosOrdenadosPorPreco());


    }
}
