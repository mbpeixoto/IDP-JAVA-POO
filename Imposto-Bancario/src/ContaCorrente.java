public class ContaCorrente extends Conta implements Tributavel {
    
    public double calculaTributos(double valor){
        return (0.01 * valor);
    }
}
