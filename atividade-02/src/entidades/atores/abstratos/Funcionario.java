package entidades.atores.abstratos;

import basededados.Pessoas;
import basededados.Produtos;
import entidades.produtos.abstratos.Produto;

public abstract class Funcionario extends Pessoa {
    /** login do funcionário */
    protected String login;
    /** senha do funcionário */ 
    protected String senha;

    public Funcionario() { super(); }

    /** 
     * Construtor do funcionário.
     * @param nome do funcionário.
     * @param matricula codigo de cadastro.
     * @param login para entrar no sistema.
     * @param senha para confirmar entrada no sistema.
     * */ 
    public Funcionario(String nome, int matricula, String login, String senha) {
        super(nome, matricula);
        this.login = login;
        this.senha = senha;
    }
    
    /**
     * Retorna produto que tem o mesmo código do parâmetro
     * @param cod
     * @return Produto que tem o codigo correspondente
     */
    public Produto procurarProduto(String cod) {
        if(Produtos.obterInstancia().getProdutos().containsKey(cod));
            return Produtos.obterInstancia().getProdutos().get(cod);
    }

    /**
     * Obtêm cliente apartir da matricula
     * @param m
     * @return cliente com matricula indicada
     */
    public Pessoa procurarCliente(String m) {
        if(Pessoas.obterInstancia().getPessoas().containsKey(m))
            return Pessoas.obterInstancia().getPessoas().get(m);
        return null;
    }

    public String getSenha() {
        return senha;
    }

    public String getLogin() {
        return login;
    }

    public boolean equals(Funcionario f) {
        return this.login == f.login && this.senha == f.senha;
    }
    
    public String toString() {
        return super.toString() + String.format("| Login: %-6s| Senha: %-6s", login, senha);
    }
}
