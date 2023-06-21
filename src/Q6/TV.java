package Q6;

public class TV {
    private int numeroCanal;
    private int volume;

    public int getNumeroCanal(){return numeroCanal;}
    public int getVolume(){return volume;}

    public void setNumeroCanal(int numeroCanal){
        if(numeroCanal>0 && numeroCanal<1000){
            this.numeroCanal = numeroCanal;
        }
        else{
            System.out.println("Numero de canal invalido!!!");
        }
    }
    public void aumentarVolume(){
        if(volume<100){
          volume += 5;
        }
        if(volume == 100){
            System.out.println("Volume maximo atingido!!!!");
        }

    }
    public void diminuirVolume(){
        if(volume>0){
            volume -= 1;
        }
        if(volume == 0){
            System.out.println("Sem Som!!!");
        }
    }
}
