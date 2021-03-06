package src.espm.poo.Ex2;

public class Cliente {
    
    private String nome;
    private String cpf;
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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "{nome: " + nome + 
               " cpf: " + cpf + 
               " conta: " + conta + "}";
    }

    public Conta getConta() {
        return conta;
    }
}
