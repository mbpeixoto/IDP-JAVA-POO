// Classe base para operações comerciais
class OperacaoComercial {
    private String descricao;
    private double valorItem;

    public OperacaoComercial(String descricao, double valorItem) {
        this.descricao = descricao;
        this.valorItem = valorItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorItem() {
        return valorItem;
    }
}
