package set.OperacoesBasicas.ConjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codConvite){
        convidadoSet.add(new Convidado(nome, codConvite));
    }

    //utilizo o codConvite pois, posso ter duas pessoas com mesmo nome.
    public void removerConvidadePorCodigoConvite(int codConvite){
        Convidado convidadoParaRemover = null;
        if(!convidadoSet.isEmpty()) {
            for (Convidado c : convidadoSet) {
                if (c.getCodConvite() == codConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
        } else{
            System.out.println("Não há convidados.");
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjConvidados = new ConjuntoConvidados();

        System.out.println("Número de convidados: " + conjConvidados.contarConvidados());

        conjConvidados.adicionarConvidado("Joao", 1);
        conjConvidados.adicionarConvidado("Luiz", 2);
        conjConvidados.adicionarConvidado("Mauro", 3);
        conjConvidados.adicionarConvidado("Joao", 4);
        conjConvidados.adicionarConvidado("Maria", 5);

        System.out.println("Número de convidados: " + conjConvidados.contarConvidados());
        conjConvidados.exibirConvidados();

        conjConvidados.removerConvidadePorCodigoConvite(04);
        System.out.println("Número de convidados: " + conjConvidados.contarConvidados());
        conjConvidados.exibirConvidados();

    }
}