package Q7;

public class BichinhoVirtual {
    private String nome;
    private int fome = 100;
    private int saude = 100;
    private int idade = 100;

    public String getNome() {
        return nome;
    }
    public int getFome() {
        return fome;
    }
    public int getIdade() {
        return idade;
    }
    public int getSaude() {
        return saude;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }
    public void humor() {
        if (saude > 70 && fome > 70) {
            System.out.println("Feliz!!!");
        } else if ((saude > 40) && (saude <= 70) && (fome > 40) && (fome <= 70)) {
            System.out.println("Neutro");
        } else {
            System.out.println("Triste!!!");
        }
    }
}
