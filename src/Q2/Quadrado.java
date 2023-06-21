package Q2;

public class Quadrado {
    private double tamanhoLado;

    public double getTamanhoLado(){return tamanhoLado;}

    public void setTamanhoLado(double tamanhoLado){
        this.tamanhoLado = tamanhoLado;
    }
    public double areaQuadrado(){
        return tamanhoLado*tamanhoLado;
    }
}
