public abstract class Conta implements IConta {

    private static int AGENCIA_PADRAO = 0001;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numConta;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numConta = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    public void imprimirExtrato() {

    };

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero Conta %d", numConta));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
}
