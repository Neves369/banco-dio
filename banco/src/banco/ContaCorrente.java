package banco;

public class ContaCorrente extends Conta {
    private double taxaManutencao;

    public ContaCorrente(String numero, double taxaManutencao) {
        super(numero);
        this.taxaManutencao = taxaManutencao;
    }

    public void cobrarTaxa() {
        sacar(taxaManutencao);
    }
}

