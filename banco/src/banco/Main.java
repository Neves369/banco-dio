package banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente cc = new ContaCorrente("123", 15.00);
        ContaPoupanca cp = new ContaPoupanca("456", 0.05);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.depositar(500.00);
        cp.depositar(1000.00);

        cc.transferir(cp, 200.00);

        System.out.println("Saldo CC: " + cc.getSaldo()); 
        System.out.println("Saldo CP: " + cp.getSaldo());

        cp.renderJuros();

        System.out.println("Saldo CP após render juros: " + cp.getSaldo()); 
    }
}
