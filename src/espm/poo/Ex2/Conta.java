package src.espm.poo.Ex2;

public class Conta {
    
    private int id;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
    }
}
