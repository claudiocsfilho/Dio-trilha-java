package list.Pesquisa.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros(){
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro (String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }else {
            System.out.println("Lista vazia.");
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }else{
            System.out.println("Lista vazia.");
        }
        return livrosPorIntervaloAnos;
    }

    //retorna Livro porque é apenas um, de acordo com a regra de negócio.
    public Livro pesquisaPorTitulo(String titulo){
        //iniciar um objeto do tipo Livro
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()){
            for (Livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        } else {
            System.out.println("Lista vazia.");
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2024);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println("Pesquisa por Autor:\n" + catalogoLivros.pesquisarPorAutor("autor 4"));
        System.out.println("Pesquisa por Intervalo de ano:\n" + catalogoLivros.pesquisaPorIntervaloAnos(1993, 1995));
        System.out.println("Pesquisa por Título: \n" + catalogoLivros.pesquisaPorTitulo("livro 1"));


    }

}
