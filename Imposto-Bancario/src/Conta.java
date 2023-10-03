public class Conta{
    public double saldo;

    public void sacar(double valor){
        this.saldo = this.saldo - valor;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public double obterSaldo(){
        return this.saldo;
    }

    public Conta (){
        this.saldo=0;
    }
}