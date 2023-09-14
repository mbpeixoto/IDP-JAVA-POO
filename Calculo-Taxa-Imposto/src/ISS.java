// Classe para cálculo do ISS
class ISS {
    private static final double ALIQUOTA = 0.046; // 4.6%

    public static double calcular(OperacaoComercial operacao) {
        if (operacao.getDescricao().toLowerCase().contains("serviço")) {
            return operacao.getValorItem() * ALIQUOTA;
        }
        return 0.0;
    }
}

