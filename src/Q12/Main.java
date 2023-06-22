package Q12;

public class Main {
    public static void main(String[] args) {
        ContaInvestimento poupanca = new ContaInvestimento(1000.00, 0.10);

        for (int i = 0; i < 5; i++) {
            poupanca.adicioneJuros();
        }

        System.out.println("Saldo resultante: R$" + poupanca.getSaldo());
    }
}
