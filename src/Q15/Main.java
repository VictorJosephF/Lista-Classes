package Q15;

public class Main {
    public static void main(String[] args) {
        Tamagotchi meuTamagotchi = new Tamagotchi("Fofinho", 8, 7, 2, 10);

        System.out.println("Nome: " + meuTamagotchi.retornarNome());
        System.out.println("Fome: " + meuTamagotchi.retornarFome());
        System.out.println("Saúde: " + meuTamagotchi.retornarSaude());
        System.out.println("Idade: " + meuTamagotchi.retornarIdade());
        System.out.println("Tédio: " + meuTamagotchi.retornarTedio());
        System.out.println("Humor: " + meuTamagotchi.calcularHumor());

        meuTamagotchi.alimentar(3);
        meuTamagotchi.brincar(5);

        System.out.println("Fome atualizada: " + meuTamagotchi.retornarFome());
        System.out.println("Tédio atualizado: " + meuTamagotchi.retornarTedio());
        System.out.println("Novo humor: " + meuTamagotchi.calcularHumor());
    }
}
