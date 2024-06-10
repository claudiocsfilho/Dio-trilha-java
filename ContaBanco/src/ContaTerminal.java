import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência 'xxx-x':");
        agencia = ler.nextLine();

        System.out.println("Por favor, digite o número da Conta 'xxxx':");
        numero = ler.nextInt();
        ler.nextLine(); //utilizado para limpar o Buffer após uso de nextInt e nextDouble

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = ler.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        saldo = ler.nextDouble();
        ler.nextLine();

        System.out.println("Olá "+nomeCliente+
                ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
                ", conta nº: "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}