package set.Ordenacao.ListaDeAlunos;

import java.time.temporal.TemporalUnit;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota){
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        Aluno removerAluno = null;
        if (!alunoSet.isEmpty()){
            for (Aluno a : alunoSet){
                if (a.getMatricula() == matricula){
                    removerAluno = a;
                    break;
                }
            }
            alunoSet.remove(removerAluno);
        }else{
            System.out.println("A lista está vazia");
        }
        if (removerAluno == null){
            System.out.println("Aluno não encontrado!");
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        return alunoPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }

    public void exibirAlunos(){
        if (!alunoSet.isEmpty()) {
            System.out.println(alunoSet);
        }else{
            System.out.println("Não há alunos no conjunto!");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos ga = new GerenciadorAlunos();

//        ga.exibirAlunos();
        ga.adicionarAluno("Joao", 1234L, 75d);
        ga.adicionarAluno("Joao P", 1234L, 76d);
        ga.adicionarAluno("Maria", 2134L, 65d);
        ga.adicionarAluno("Julia", 1243L, 80d);
        ga.adicionarAluno("Nestor", 1342L, 55d);

        ga.exibirAlunos();
//        ga.removerAluno(1234L);
//        ga.exibirAlunos();

        System.out.println("\nExibindo alunos por nome: " + ga.exibirAlunosPorNome());

        System.out.println("\nExibindo alunos por nota: " + ga.exibirAlunosPorNota());

    }

}
