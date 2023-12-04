public class Jogador {
    private String nome;
    private String funcao;
    private String nomeTime;
    private String patente;

    // Construtor
    public Jogador(String nome, String funcao, String nomeTime, String patente) {
        this.nome = nome;
        this.funcao = funcao;
        this.nomeTime = nomeTime;
        this.patente = patente;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public String getPatente() {
        return patente;
    }
}
