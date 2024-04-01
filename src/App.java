public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cp.imprimirExtrato();
        cc.imprimirExtrato();
    }
}

// Dois tipos de contas - Corrente e Poupança
// Funções: deposito, saque, transferência
