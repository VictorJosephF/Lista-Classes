package Q12;

public class ContaInvestimento {
    private double saldo;
    private double taxaJuros;

    public ContaInvestimento(double saldoInicial, double taxaJuros) {
        this.saldo = saldoInicial;
        this.taxaJuros = taxaJuros;
    }

    public void adicioneJuros() {
        saldo += saldo * taxaJuros;
    }

    public double getSaldo() {
        return saldo;
    }
}
