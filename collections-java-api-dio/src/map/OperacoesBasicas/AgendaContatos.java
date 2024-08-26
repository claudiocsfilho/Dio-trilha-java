package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("Não existem contatos na agenda!");
        }
    }

    public void exibirContatos() {
        if (!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        }else {
            System.out.println("Não existem contatos na agenda!");
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        } else {
            System.out.println("Nome não encontrado na agenda!");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos ac = new AgendaContatos();

        ac.adicionarContato("Joao", 43123456);
        ac.adicionarContato("Joao", 44123456);
        ac.adicionarContato("Jauri", 43123789);
        ac.adicionarContato("Maria", 43789456);
        ac.adicionarContato("Amelia", 43456123);

        ac.exibirContatos();
        ac.removerContato("Jauri");
        ac.exibirContatos();
        System.out.println("O número da Amélia é: " +ac.pesquisarPorNome("Amelia"));
    }
}


