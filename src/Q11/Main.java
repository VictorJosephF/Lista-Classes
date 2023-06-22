package Q11;

public class Main {
    public static void main(String[] args) {
        Carro meuFusca = new Carro(15.0);
        meuFusca.adicionarGasolina(20.0);
        meuFusca.andar(100.0);
        double combustivelRestante = meuFusca.obterGasolina();
        System.out.println("Combustível restante: " + combustivelRestante + " litros.");
    }
}
