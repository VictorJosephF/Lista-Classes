package Q17;

import java.util.ArrayList;
import java.util.List;

public class FazendaDeBichinhos {
    private List<Tamagotchi> bichinhos;

    public FazendaDeBichinhos() {
        bichinhos = new ArrayList<>();
    }

    public void adicionarBichinho(Tamagotchi bichinho) {
        bichinhos.add(bichinho);
    }

    public void alimentarTodos(int quantidadeComida) {
        for (Tamagotchi bichinho : bichinhos) {
            bichinho.alimentar(quantidadeComida);
        }
    }

    public void brincarTodos(int tempoBrincadeira) {
        for (Tamagotchi bichinho : bichinhos) {
            bichinho.brincar(tempoBrincadeira);
        }
    }

    public void ouvirTodos() {
        for (Tamagotchi bichinho : bichinhos) {
            System.out.println("Nome: " + bichinho.retornarNome());
            System.out.println("Fome: " + bichinho.retornarFome());
            System.out.println("Saúde: " + bichinho.retornarSaude());
            System.out.println("Idade: " + bichinho.retornarIdade());
            System.out.println("Tédio: " + bichinho.retornarTedio());
            System.out.println("Humor: " + bichinho.calcularHumor());
            System.out.println("--------------------------------------");
        }
    }
}
