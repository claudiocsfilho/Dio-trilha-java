package ExerciciosStreamAPIJava;

import java.util.Arrays;
import java.util.List;

public class Desafio17FiltrarNumsPrimos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numsPrimos = numeros.stream()
                .filter(Desafio17FiltrarNumsPrimos::isPrimo)
                .toList();

        System.out.println("Números Primos: " + numsPrimos);
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
