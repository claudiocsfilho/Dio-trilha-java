package Exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        //Lista com número inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //Usar o Consumer com expressão lambda para imprimir números pares.
//        Consumer<Integer> imprimirNumeroPar = numero -> {
//            if (numero %2 == 0){
//                System.out.println(numero);
//            }
//        };

        //Usa o Consumer para imprimir números pares no Stream
        numeros.forEach(n -> {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        );

        //Posso utilizar o filter do predicate também.
        numeros.stream()
                .filter(n -> n %2 ==0)
                .forEach(System.out::println);
    }
}
