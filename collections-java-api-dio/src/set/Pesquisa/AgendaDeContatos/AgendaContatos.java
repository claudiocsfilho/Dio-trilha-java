package set.Pesquisa.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        if (!contatoSet.isEmpty()) {
            System.out.println(contatoSet.size());
            System.out.println(contatoSet);
        }else{
            System.out.println("Não há contatos cadastrados.");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            //.startsWith() é um método que busca pela referencia, no caso abaixo pelo nome.
            if (c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos ag = new AgendaContatos();

        ag.adicionarContato("Joao", 11111111);
        ag.adicionarContato("Joao Paulo", 22222222);
        ag.adicionarContato("Joana", 33333333);
        ag.adicionarContato("Julia", 44444444);
        ag.adicionarContato("Joao Carlos", 55555555);

        ag.exibirContatos();

//        System.out.println(ag.pesquisarPorNome("Jo"));

        ag.atualizarNumeroContato("Joao", 66666666);
        ag.exibirContatos();


    }

}
