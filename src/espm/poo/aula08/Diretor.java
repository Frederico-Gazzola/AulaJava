package src.espm.poo.aula08;

public class Diretor extends Funcionario implements Usuario{
    
    public Diretor (int id) {
        super(id);
    }

    @Override
    public String getUsername() {
        return "dir." + super.getId();
    }

    @Override
    public boolean autenticar(String password) {
        return false;
    }
}
