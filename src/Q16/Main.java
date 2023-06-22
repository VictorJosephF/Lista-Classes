package Q16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tamagotchi meuTamagotchi = new Tamagotchi("Fofinho", 8, 7, 2, 10);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Alimentar");
            System.out.println("2. Brincar");
            System.out.println("3. Exibir humor");
            System.out.println("4. Opção secreta");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Quantidade de comida: ");
                    int quantidadeComida = scanner.nextInt();
                    meuTamagotchi.alimentar(quantidadeComida);
                    break;
                case 2:
                    System.out.println("Tempo de brincadeira: ");
                    int tempoBrincadeira = scanner.nextInt();
                    meuTamagotchi.brincar(tempoBrincadeira);
                    break;
                case 3:
                    System.out.println("Humor: " + meuTamagotchi.calcularHumor());
                    break;
                case 4:
                    System.out.println(meuTamagotchi);
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

