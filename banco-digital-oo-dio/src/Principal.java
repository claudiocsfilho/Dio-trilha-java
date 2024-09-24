public class Principal {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("João");

        Conta cc = new ContaCorrente(c1);
        Conta cp = new ContaPoupanca(c1);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.depositar(100);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
