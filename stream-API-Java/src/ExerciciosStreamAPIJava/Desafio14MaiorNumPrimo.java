package ExerciciosStreamAPIJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio14MaiorNumPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> numPrimo = numeros.stream()
                .filter(Desafio14MaiorNumPrimo::isPrimo)
                .toList()
                .stream().max(Comparator.naturalOrder());

        System.out.println("Maior número primo da lista: " + numPrimo.get());

    }

    public static boolean isPrimo (int n){
        n = Math.abs(n);

        if (n <= 1){
            return false;
        }
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
