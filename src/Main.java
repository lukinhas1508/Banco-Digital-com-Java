import desafio.Cliente;
import desafio.Conta;
import desafio.ContaCorrente;
import desafio.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");

        Conta cc = new ContaCorrente(lucas);
        cc.depositar(150);

        Conta poupanca  = new ContaPoupanca(lucas);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
