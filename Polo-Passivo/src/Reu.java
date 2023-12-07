public class Reu {
    private int id;
    private String nome;
    private String email;
    private String cpf;
    private String endereco;
    private String estadoCivil;
    private String profissao;
    private int idAdvogado;

    // Construtor com todos os atributos
    public Reu(int id, String nome, String email, String cpf, String endereco,
               String estadoCivil, String profissao, int idAdvogado) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
        this.idAdvogado = idAdvogado;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getProfissao() {
        return profissao;
    }

    public int getIdAdvogado() {
        return idAdvogado;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setIdAdvogado(int idAdvogado) {
        this.idAdvogado = idAdvogado;
    }

    @Override
    public String toString() {
        return "Reu{" +
                "id=" + id + " " +
                ", nome='" + nome +
        ", email='" + email + " " +
        ", cpf='" + cpf + " " +
        ", endereco='" + endereco + " " +
        ", estadoCivil='" + estadoCivil + " " +
        ", profissao='" + profissao + " " +
        ", idAdvogado=" + idAdvogado +
                '}';
    }
}
