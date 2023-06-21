package Q8;

public class Macaco {
    private String nome;
    private String bucho;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void comer(String comida){
       bucho += comida + " ";
    }
    public void digerir(){
        bucho = "";
        System.out.println(nome+" digeriu a comida.");
    }
    public void verBucho(){
        if(bucho.isEmpty()){
            System.out.println(nome+ " esta de estomago vazio.");
        }
        else{
            System.out.println(nome + " comeu: "+ bucho);
        }
    }
    public Macaco(String nome){
        this.nome = nome;
        this.bucho = "";
    }
}
