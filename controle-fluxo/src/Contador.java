import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int parametroUm;
        int parametroDois;

        System.out.println("<<< Contador >>>\nDigite números de 0 a 50\n\n");

        System.out.println("Digite o valor do 1º Parâmetro:");
        parametroUm = ler.nextInt();
        System.out.println("Digite o valor do 2º Parâmetro:");
        parametroDois = ler.nextInt();
        ler.close();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {

            System.err.println("**ERRO**\nO 2º parâmetro deve ser maior que o 1º");

        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm < parametroDois){
            int contagem = parametroDois - parametroUm;

            for (int i=1; i<=contagem; i++){
                System.out.println("Imprimindo o número "+i);
            }
        }else {
            throw new ParametrosInvalidosException();
        }
    }



}
