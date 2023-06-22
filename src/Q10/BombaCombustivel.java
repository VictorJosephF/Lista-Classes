package Q10;

public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valorAbastecido) {
        double litrosAbastecidos = valorAbastecido / valorLitro;
        if (litrosAbastecidos <= quantidadeCombustivel) {
            quantidadeCombustivel -= litrosAbastecidos;
            System.out.println("Abastecimento realizado. Litros abastecidos: " + litrosAbastecidos);
        } else {
            System.out.println("Não há combustível suficiente para abastecer essa quantidade.");
        }
    }

    public void abastecerPorLitro(double litrosAbastecidos) {
        double valorPagar = litrosAbastecidos * valorLitro;
        if (litrosAbastecidos <= quantidadeCombustivel) {
            quantidadeCombustivel -= litrosAbastecidos;
            System.out.println("Abastecimento realizado. Valor a pagar: " + valorPagar);
        } else {
            System.out.println("Não há combustível suficiente para abastecer essa quantidade.");
        }
    }

    public void alterarValor(double novoValor) {
        valorLitro = novoValor;
        System.out.println("Valor do litro alterado para: " + novoValor);
    }

    public void alterarCombustivel(String novoCombustivel) {
        tipoCombustivel = novoCombustivel;
        System.out.println("Tipo de combustível alterado para: " + novoCombustivel);
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        quantidadeCombustivel = novaQuantidade;
        System.out.println("Quantidade de combustível alterada para: " + novaQuantidade);
    }
}
