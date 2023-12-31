package Q16;

public class Tamagotchi {
    private String nome;
    private int fome;
    private int saude;
    private int idade;
    private int tedio;

    public Tamagotchi(String nome, int fome, int saude, int idade, int tedio) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
        this.tedio = tedio;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void alimentar(int quantidadeComida) {
        fome -= quantidadeComida;
        if (fome < 0) {
            fome = 0;
        }
    }

    public void brincar(int tempoBrincadeira) {
        tedio -= tempoBrincadeira;
        if (tedio < 0) {
            tedio = 0;
        }
    }

    public void alterarSaude(int saude) {
        this.saude = saude;
    }

    public void alterarIdade(int idade) {
        this.idade = idade;
    }

    public String retornarNome() {
        return nome;
    }

    public int retornarFome() {
        return fome;
    }

    public int retornarSaude() {
        return saude;
    }

    public int retornarIdade() {
        return idade;
    }

    public int retornarTedio() {
        return tedio;
    }
    public String calcularHumor() {
        if (fome <= 5 && saude >= 5 && tedio <= 5) {
            return "Feliz";
        } else if (fome > 5 && saude >= 5 && tedio <= 5) {
            return "Com fome";
        } else if (fome <= 5 && saude < 5 && tedio <= 5) {
            return "Doente";
        } else {
            return "Triste";
        }
    }
    public String toString() {
        return "Tamagotchi [Nome=" + nome + ", Fome=" + fome + ", Saúde=" + saude + ", Idade=" + idade + ", Tédio=" + tedio + "]";
    }
}
