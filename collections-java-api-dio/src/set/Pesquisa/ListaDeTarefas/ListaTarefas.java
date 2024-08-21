package set.Pesquisa.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        }else{
            System.out.println("Não há tarefas");
        }
        if (tarefaParaRemover == null){
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefa(){
        System.out.println(tarefaSet);
    }

    public int contarTarefa(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluida = new HashSet<>();
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (t.isConcluido()){
                    tarefasConcluida.add(t);
                }
            }
        }else{
            System.out.println("O conjunto está vazio!");
        }
        return tarefasConcluida;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (!t.isConcluido()){
                    tarefasPendentes.add(t);
                }
            }
        }else{
            System.out.println("O conjunto está vazio!");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluido(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaMarcarComoPendente = null;
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaMarcarComoPendente = t;
                break;
            }
        }

        if (tarefaMarcarComoPendente != null){
            if (tarefaMarcarComoPendente.isConcluido()){
                tarefaMarcarComoPendente.setConcluido(false);
            }else{
                System.out.println("Tarefa ainda pendente");
            }
        }
    }

    public void limparListaTarefa(){
        if (tarefaSet.isEmpty()){
            System.out.println("A lista já está vazia!");
        } else{
            tarefaSet.clear();
        }
    }

//******************************

    public static void main(String[] args) {
        ListaTarefas lt = new ListaTarefas();

//        System.out.println(lt.contarTarefa());
        lt.adicionarTarefa("limpar cozinha");
        lt.adicionarTarefa("arrumar quarto");
        lt.adicionarTarefa("estudar");
        lt.adicionarTarefa("ler");
        lt.adicionarTarefa("banho");

        System.out.println(lt.contarTarefa());
        lt.exibirTarefa();

        System.out.println("\nTarefas Concluídas: " + lt.obterTarefasConcluidas());
        System.out.println("Tarefas Pendentes: " + lt.obterTarefasPendentes());

        lt.marcarTarefaConcluida("Limpar cozinha");
        lt.marcarTarefaConcluida("Banho");

        System.out.println("\nTarefas Concluídas: " + lt.obterTarefasConcluidas());
        System.out.println("Tarefas Pendentes: " + lt.obterTarefasPendentes());

        lt.marcarTarefaPendente("banho");
        System.out.println("\nTarefas Concluídas: " + lt.obterTarefasConcluidas());
        System.out.println("Tarefas Pendentes: " + lt.obterTarefasPendentes());
    }


}