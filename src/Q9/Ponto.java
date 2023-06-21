package Q9;

public class Ponto {
    public double x;
    public double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void valorPonto() {
        System.out.println("X: " + x + " Y: " + y);
    }
}


