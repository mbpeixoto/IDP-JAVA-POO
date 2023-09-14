// Classe para cálculo do IPI
class IPI {
    private static final double ALIQUOTA = 0.25; // 25%

    public static double calcular(OperacaoComercial operacao) {
        if (operacao.getDescricao().toLowerCase().contains("produto")) {
            return operacao.getValorItem() * ALIQUOTA;
        }
        return 0.0;
    }
}
