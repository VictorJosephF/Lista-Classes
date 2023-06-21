package Q9;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de x do vértice inicial do retângulo: ");
        double x = scanner.nextDouble();
        System.out.print("Digite o valor de y do vértice inicial do retângulo: ");
        double y = scanner.nextDouble();
        Ponto verticeInicial = new Ponto(x, y);

        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        Retangulo retangulo = new Retangulo(largura, altura, verticeInicial);

        int opcao = 0;
        while (opcao != 3) {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Alterar valores do retângulo");
            System.out.println("2. Imprimir centro do retângulo");
            System.out.println("3. Sair");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                    System.out.print("\nDigite o valor de x do vértice inicial do retângulo: ");
                    x = scanner.nextDouble();
                    System.out.print("Digite o valor de y do vértice inicial do retângulo: ");
                    y = scanner.nextDouble();
                    verticeInicial = new Ponto(x, y);

                    System.out.print("Digite a largura do retângulo: ");
                    largura = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    altura = scanner.nextDouble();
                    retangulo = new Retangulo(largura, altura, verticeInicial);
                    break;
                case 2:
                    Ponto centro = retangulo.Centro();
                    System.out.println("\nCentro do retângulo:");
                    centro.valorPonto();
                    break;
                case 3:
                    System.out.println("\nEncerrando o programa...");
                    break;

            }

        }
    }
}
