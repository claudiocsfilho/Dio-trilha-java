package ExerciciosStreamAPIJava;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Desafio5MediaMaior5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double media = numeros.stream()
                .filter(n -> n >5)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElseThrow(() -> new NoSuchElementException("Não foi possível encontrar a média"));
        //Por que disso? O método average() retorna um Optional, aí precisamos "tratar" esse resultado.
        //Tem vários métodos para fazer esse "tratamento".
        // No exemplo acima, foi tratado lançando uma NoSuchElementException caso
        // o resultado não seja encontrado por algum motivo...

        System.out.println("A média dos números maiores que 5 é: " + media);

    }
}