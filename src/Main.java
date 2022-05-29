public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.depositar(10);
        cc.transferir(5, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
