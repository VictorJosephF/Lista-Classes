package Q13;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 2000.00);

        String nome = funcionario.getNome();
        double salario = funcionario.getSalario();

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário do funcionário: R$" + salario);
    }
}
