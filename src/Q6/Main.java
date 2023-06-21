package Q6;

public class Main {
    public static void main(String[] args) {
         TV tv = new TV();
          tv.setNumeroCanal(12);

          tv.aumentarVolume();
          tv.diminuirVolume();

              System.out.println("Canal: "+ tv.getNumeroCanal());
              System.out.println("volume: "+ tv.getVolume());
    }
}
