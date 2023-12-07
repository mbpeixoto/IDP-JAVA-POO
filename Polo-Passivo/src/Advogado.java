public class Advogado {
    private int id;
    private String nome;
    private String oab;
    private String endereco;

    public Advogado(int id, String nome, String oab, String endereco) {
        this.id = id;
        this.nome = nome;
        this.oab = oab;
        this.endereco = endereco;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Reu{" +
                "id=" + id + " " +
                ", nome='" + nome +
                ", oab='" + oab + " " +
                ", endereco=" + endereco + "}";
    }
}
