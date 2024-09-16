package Exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero *2;

        // Usar a função para dobrar todos os número no Stream e armezená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();

        // Utilizando o Lambda
        List<Integer> numeroDobrado = numeros.stream()
                .map(n -> n*2)
                .toList();

        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(System.out::println);

        numeroDobrado.forEach(System.out::println);
    }
}
