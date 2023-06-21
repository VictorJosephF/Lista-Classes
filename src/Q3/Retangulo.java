package Q3;

public class Retangulo {
    private double base;
    private double altura;

    public double getBase(){return base;}
    public double getAltura(){return altura;}

    public void setBase(double base){this.base = base;}
    public void setAltura(double altura){this.altura = altura;}

    public double areaRetangulo(){return base*altura;}
    public double perimetroRetangulo(){return 2*(base+altura);}
}
