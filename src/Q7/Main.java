package Q7;

public class Main {
    public static void main(String[] args) {
        BichinhoVirtual tamugushi = new BichinhoVirtual();

        tamugushi.setNome("Koda");
        tamugushi.setFome(69);
        tamugushi.setSaude(65);
        tamugushi.setIdade(2);

        System.out.println("Nome: "+tamugushi.getNome());
        System.out.println("Idade: "+tamugushi.getIdade());
        System.out.println("Saúde: "+tamugushi.getSaude());
        System.out.println("Fome: "+tamugushi.getFome());
        System.out.print("Humor: ");
        tamugushi.humor();
    }
}
