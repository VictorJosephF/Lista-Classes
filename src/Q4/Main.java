package Q4;

public class Main {
    public static void main(String[] args) {
        Pessoa person = new Pessoa("Victor", 18, 95,190);
        int anos = 10;
        double quilos = 9;
        person.envelhecer(anos);
        person.engordar(2*quilos);
        person.emagrecer(quilos);
        person.crescer(8);

        System.out.println("Nome: "+ person.getNome());
        System.out.println("Idade: "+ person.getIdade());
        System.out.println("Peso: "+ person.getPeso());
        System.out.println("Altura: "+ person.getAltura());
    }
}
