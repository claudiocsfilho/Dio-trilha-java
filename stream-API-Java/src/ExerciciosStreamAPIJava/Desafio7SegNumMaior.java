package ExerciciosStreamAPIJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Desafio7SegNumMaior {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maiorNum = numeros.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow(() -> new NoSuchElementException("Não foi possível encontrar o elemento."));

        int segMaiorNum = numeros.stream()
                .filter(n -> n != maiorNum)
                .max(Comparator.naturalOrder())
                .orElseThrow(()-> new NoSuchElementException("Elemento não encontrado!"));

        System.out.println(segMaiorNum);
    }
}