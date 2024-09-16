package ExerciciosStreamAPIJava;

import java.util.Arrays;
import java.util.List;

public class Desafio10AgrupeNumImp3e5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numImp3 = numeros.stream()
                .filter(n -> n%3 == 0)
                .toList();

        List<Integer> numImp5 = numeros.stream()
                .filter(n -> n%5 == 0)
                .toList();

        System.out.println("Números múltiplos de 3: " + numImp3);
        System.out.println("Números múltiplos de 5: " + numImp5);

    }
}
