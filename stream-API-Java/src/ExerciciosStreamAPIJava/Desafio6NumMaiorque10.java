package ExerciciosStreamAPIJava;

import java.util.Arrays;
import java.util.List;

public class Desafio6NumMaiorque10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);

        numeros.stream()
                .filter(n -> n > 10)
                .forEach(System.out::println);

    }
}