package Q10;

public class Main {
    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.0, 100.0);
        bomba.abastecerPorValor(50.0);
        bomba.abastecerPorLitro(20.0);
        bomba.alterarValor(5.5);
        bomba.alterarCombustivel("Etanol");
        bomba.alterarQuantidadeCombustivel(150.0);
    }
}
