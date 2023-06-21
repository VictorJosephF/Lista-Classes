package Q5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(5674456, "Victor Joseph", 1000.23);

        conta.deposito(100);
        conta.saque(55);
        conta.setNomeCorrentista("Victor Joseph Faria");

        System.out.println("Nome do correntista: "+ conta.getNomeCorrentista());
        System.out.println("Numero da conta: "+ conta.getNumeroConta());
        System.out.println("saldo da conta: "+ conta.getSaldo());

    }
}
