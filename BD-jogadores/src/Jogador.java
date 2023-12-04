public class Jogador {
    private String nome;
    private String funcao;
    private String nomeTime;
    private String patente;
    private Long id;

    // Construtor vazio necessário para JPA
    public Jogador() {
    }
    // Construtor
    public Jogador(Long id, String nome, String funcao, String nomeTime, String patente) {
        this.id = id;
        this.nome = nome;
        this.funcao = funcao;
        this.nomeTime = nomeTime;
        this.patente = patente;
    }

    // Getters
    public Long getId() {
        return id;
    }
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
