package ExerciciosStreamAPIJava;

import java.util.Arrays;
import java.util.List;

public class Desafio16NumsParImpar {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numsPares = numeros.stream()
                .filter(n -> n%2 == 0)
                .toList();

        List<Integer> numsImpares = numeros.stream()
                .filter(n -> n%2 != 0)
                .toList();

        System.out.println("Números Pares: " + numsPares);
        System.out.println("Números Ímpares: " + numsImpares);
    }
}
