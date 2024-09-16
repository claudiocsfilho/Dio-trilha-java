package Exemplos;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {

        //Usar o Supplier com expressão lambda para fornecer uma saudação personalizada.
        //Supplier não recebe nenhum argumento, por isso () vazio.
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo";

        //Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        //Poderia também passar o Supplier diretamento no generate()
        List<String> listaOlaMundo = Stream.generate(() -> "Olá, Mundo")
                .limit(5)
                .toList();

        //Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
        listaOlaMundo.forEach(System.out::println);
    }
}
