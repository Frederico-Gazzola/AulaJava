package src.espm.poo.Ex2;

public class Conta {
    
    private int id;
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
    }

    public void depositar(double valor) {
        if (valor > 0) {
        this.saldo = this.saldo + valor;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

}
