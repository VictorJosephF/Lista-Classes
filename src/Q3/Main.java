package Q3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Retangulo ret = new Retangulo();
        System.out.println("Informe o valor da base do retangulo: ");
        ret.setBase(read.nextDouble());
        System.out.println("Informe o valor da altura do retangulo: ");
        ret.setAltura(read.nextDouble());
        read.close();
        System.out.println("O valor da base é: "+ ret.getBase());
        System.out.println("O valor da altura é: "+ ret.getAltura());
        System.out.println("A área desse retangulo é: "+ ret.areaRetangulo());
        System.out.println("O perimetro desse retangulo é: "+ret.perimetroRetangulo());
    }
}
