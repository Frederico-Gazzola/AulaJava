package src.espm.poo.Ex2;

public class Cliente {
    
    private String nome;
    private Conta conta;

    public Cliente() {
        this.conta = new Conta(this);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "{nome: " + nome +  
               " conta: " + conta + "}";
    }

    public Conta getConta() {
        return conta;
    }
}
