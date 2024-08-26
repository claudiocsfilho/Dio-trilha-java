package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    //Atenção neste método! Para ordenar utilizaremos o TREEMAP.
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data: " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos ae = new AgendaEventos();

        ae.adicionarEvento(LocalDate.of(2024, Month.JULY, 25), "Evento 1", "Detonautas");
        ae.adicionarEvento(LocalDate.of(2024, 8, 29), "Evento 2", "CPM");
        ae.adicionarEvento(LocalDate.of(2024, Month.DECEMBER, 14), "Evento 3", "Pitty");
        ae.adicionarEvento(LocalDate.of(2025, 1, 23), "Evento 4", "Paralamas");

        ae.exibirAgenda();
        ae.obterProximoEvento();
    }

}
