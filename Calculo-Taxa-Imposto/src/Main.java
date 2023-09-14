public class Main {
    public static void main(String[] args) {
        // Exemplo de operação comercial
        OperacaoComercial operacao1 = new OperacaoComercial("Produto A", 100.0);
        OperacaoComercial operacao2 = new OperacaoComercial("Serviço B", 200.0);
        OperacaoComercial operacao3 = new OperacaoComercial("Produto C", 150.0);

        // Cálculo dos impostos e taxas
        double iss1 = ISS.calcular(operacao1);
        double icms1 = ICMS.calcular(operacao1);
        double ipi1 = IPI.calcular(operacao1);

        double iss2 = ISS.calcular(operacao2);
        double icms2 = ICMS.calcular(operacao2);
        double ipi2 = IPI.calcular(operacao2);

        double iss3 = ISS.calcular(operacao3);
        double icms3 = ICMS.calcular(operacao3);
        double ipi3 = IPI.calcular(operacao3);

        // Impressão dos resultados
        System.out.println("Detalhes da Operação 1:");
        System.out.println("Descrição: " + operacao1.getDescricao());
        System.out.println("Valor do Item: R$" + operacao1.getValorItem());
        System.out.println("ISS: R$" + iss1);
        System.out.println("ICMS: R$" + icms1);
        System.out.println("IPI: R$" + ipi1);
        System.out.println("Total: R$" + (operacao1.getValorItem() + iss1 + icms1 + ipi1));

        System.out.println("\nDetalhes da Operação 2:");
        System.out.println("Descrição: " + operacao2.getDescricao());
        System.out.println("Valor do Item: R$" + operacao2.getValorItem());
        System.out.println("ISS: R$" + iss2);
        System.out.println("ICMS: R$" + icms2);
        System.out.println("IPI: R$" + ipi2);
        System.out.println("Total: R$" + (operacao2.getValorItem() + iss2 + icms2 + ipi2));

        System.out.println("\nDetalhes da Operação 3:");
        System.out.println("Descrição: " + operacao3.getDescricao());
        System.out.println("Valor do Item: R$" + operacao3.getValorItem());
        System.out.println("ISS: R$" + iss3);
        System.out.println("ICMS: R$" + icms3);
        System.out.println("IPI: R$" + ipi3);
        System.out.println("Total: R$" + (operacao3.getValorItem() + iss3 + icms3 + ipi3));
    }
}