package Q5;

public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo = 0;

    public String getNomeCorrentista(){return nomeCorrentista;}
    public int getNumeroConta(){return numeroConta;}
    public double getSaldo(){return saldo;}

    public void setNomeCorrentista(String nomeCorrentista){this.nomeCorrentista = nomeCorrentista;}
    public void saque(double saque){saldo -= saque;}
    public void deposito(double deposito){saldo += deposito;}

    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo){
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
}
