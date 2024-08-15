package list.Pesquisa.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList;

    public SomaNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if (!numerosList.isEmpty()){
            for (Integer n : numerosList){
                soma += n;
            }
        }else{
            System.out.println("Lista vazia.");
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!numerosList.isEmpty()){
            for (Integer n : numerosList){
                if (n >= maiorNumero){
                    maiorNumero = n;
                }
            }
        } else {
            System.out.println("A lista está vazia!");
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!numerosList.isEmpty()){
            for (Integer n : numerosList){
                if (n <= menorNumero){
                    menorNumero = n;
                }
            }
        }else{
            System.out.println("A lista está vazia!");
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        if (!numerosList.isEmpty()) {
            System.out.println(numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(45);
        somaNumeros.adicionarNumero(78);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(1);

        somaNumeros.exibirNumeros();

        System.out.println("A soma dos números é: " + somaNumeros.calcularSoma());

        System.out.println("O maior número é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número é: " + somaNumeros.encontrarMenorNumero());
    }
}
