package Q8;

public class Main {
    public static void main(String[] args) {
        Macaco caco = new Macaco("Gorila");
        Macaco caco2 = new Macaco("Mico Leão");

        caco.comer("Pão");
        caco.verBucho();
        caco.comer("banana");
        caco.verBucho();
        caco.comer("sopa");
        caco.verBucho();
        caco.digerir();
        caco.verBucho();

        System.out.println();

        caco2.comer("Pão");
        caco2.verBucho();
        caco2.comer("banana");
        caco2.verBucho();
        caco2.comer("sopa");
        caco2.verBucho();
        caco2.digerir();
        caco2.verBucho();
        System.out.println();
        caco.comer(caco2.getNome());
        caco.verBucho();
    }
}

