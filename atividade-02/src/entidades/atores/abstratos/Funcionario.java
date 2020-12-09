package entidades.atores.abstratos;

public abstract class Funcionario extends Pessoa {
    // login do funcionário
    protected String login;
    // senha do funcionário  
    protected String senha;

    // Construtor do funcionário
    public Funcionario(String nome, int matricula, String login, String senha) {
        super(nome, matricula);
        this.login = login;
        this.senha = senha;
    }
}
