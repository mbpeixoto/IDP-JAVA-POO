public class TestaTributavel {

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();
        ContaPoupanca conta2 = new ContaPoupanca();
        double valor = 1000;
        
        conta1.depositar(valor - conta1.calculaTributos(valor));
        System.out.println(conta1.obterSaldo());

        conta2.depositar(1000);
        System.out.println(conta2.obterSaldo());

    }
}
