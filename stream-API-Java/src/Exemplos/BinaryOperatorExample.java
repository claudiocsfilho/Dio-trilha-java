package Exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Criando uma Lista de número inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);


        // Usar o BinaryOperator com expressão Lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
        // Ou utilizando o Method reference
        BinaryOperator<Integer> somar2 = Integer::sum;



        // Usar o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
                .reduce(0, somar); // o identity é como se fosse uma variável temporária que está sendo iniciada com 0
        // com lambda
        int resultado1 = numeros.stream()
                .reduce(0, (n1, n2) -> n1 + n2);
        // com method reference
        int resultado2 = numeros.stream()
                .reduce(0, Integer::sum);



        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado2);
    }
}
