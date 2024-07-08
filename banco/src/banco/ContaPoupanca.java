package banco;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numero, double taxaRendimento) {
        super(numero);
        this.taxaRendimento = taxaRendimento;
    }

    public void renderJuros() {
        depositar(getSaldo() * taxaRendimento);
    }
}