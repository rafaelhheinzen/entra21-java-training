public class Conta{
    private int numero;
    private String titular;
    private double saldo;

    public int getNumero() {
        return this.numero;
    }

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    void deposito(double valor){
        this.saldo = this.saldo + valor; 
    }

    void saque(double valor){
        this.saldo = this.saldo - valor; 
    }


    Conta(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

}