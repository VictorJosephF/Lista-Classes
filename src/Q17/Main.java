package Q17;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        FazendaDeBichinhos fazenda = new FazendaDeBichinhos();

        Random random = new Random();

        fazenda.adicionarBichinho(new Tamagotchi("Fofinho", random.nextInt(10) + 1, random.nextInt(10) + 1, random.nextInt(5) + 1, random.nextInt(10) + 1));
        fazenda.adicionarBichinho(new Tamagotchi("Fofinha", random.nextInt(10) + 1, random.nextInt(10) + 1, random.nextInt(5) + 1, random.nextInt(10) + 1));
        fazenda.adicionarBichinho(new Tamagotchi("Fofão", random.nextInt(10) + 1, random.nextInt(10) + 1, random.nextInt(5) + 1, random.nextInt(10) + 1));

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Alimentar todos os bichinhos");
            System.out.println("2. Brincar com todos os bichinhos");
            System.out.println("3. Ouvir todos os bichinhos");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Quantidade de comida: ");
                    int quantidadeComida = scanner.nextInt();
                    fazenda.alimentarTodos(quantidadeComida);
                    break;
                case 2:
                    System.out.println("Tempo de brincadeira: ");
                    int tempoBrincadeira = scanner.nextInt();
                    fazenda.brincarTodos(tempoBrincadeira);
                    break;
                case 3:
                    fazenda.ouvirTodos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }

}

