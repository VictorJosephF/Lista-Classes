package Q14;

public class Main {
    public static void main(String[] args) {
        Funcionario harry = new Funcionario("Harry", 25000.0);
        System.out.println("Salário inicial do funcionário " + harry.getNome() + ": R$" + harry.getSalario());

        harry.aumentarSalario(10);
        System.out.println("Novo salário do funcionário " + harry.getNome() + ": R$" + harry.getSalario());
    }
}
