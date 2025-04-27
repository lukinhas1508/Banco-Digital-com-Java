package desafio;

public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static  int SEQUENCIAL = 1;

    protected int agencia,numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void depositar (double valor) {
        if (valor <= 0) {
            System.out.println("Depósito inválido");
        } else {
            saldo+=valor;
        }

    }

    public void sacar (double valor){
        if (valor <= 0) {
            System.out.println("Saque inválido");
        } else if (valor > saldo) {
            System.out.println("Saque inválido");
        } else {
            saldo -= valor;

        }
    }


        public void transferir (double valor, Conta contaDestino) {

        this.sacar(valor);
        contaDestino.depositar(valor);
    }


        public int getagencia() {
            return agencia;
        }

        public int getNumero() {
            return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}

