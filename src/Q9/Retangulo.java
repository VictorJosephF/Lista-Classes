package Q9;

public class Retangulo {
    public double altura;
    public double largura;
    public Ponto verticeInicial;


    public Retangulo(double altura, double largura, Ponto verticeInicial){
        this.altura = altura;
        this.largura = largura;
        this.verticeInicial = verticeInicial;

    }
    public Ponto Centro() {
        double centroX = verticeInicial.getX() + largura / 2;
        double centroY = verticeInicial.getY() + altura / 2;
        return new Ponto(centroX, centroY);
    }
}


