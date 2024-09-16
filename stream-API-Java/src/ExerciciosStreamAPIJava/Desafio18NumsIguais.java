package ExerciciosStreamAPIJava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio18NumsIguais {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Integer, List<Integer>> grupos = numeros.stream()
                .collect(Collectors.groupingBy(num -> num));

        System.out.println(grupos);

        List<Integer> numerosRepetidos = grupos.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println(numerosRepetidos);
    }
}
