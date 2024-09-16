package ExerciciosStreamAPIJava;

import java.util.Arrays;
import java.util.List;

public class Desafio11SomaQuadNum {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int numQuad = numeros.stream()
                .mapToInt(n -> n*n)
                .sum();

        System.out.println("A soma dos números ao quadrado é: " + numQuad);


    }
}
