package entidades.atores;

import entidades.atores.abstratos.Funcionario;
import entidades.produtos.abstratos.Produto;

public class OperadorSistema extends Funcionario {
    /**
     * Construtor do Operador de Sistemas
     * @param nome do operador
     * @param matricula do operador
     * @param login do operador 
     * @param senha do operador
     */
    public OperadorSistema(String nome, int matricula, String login, String senha) {
        super(nome, matricula, login, senha);
    }

    public void fazerLocacao(Produto p, Cliente c) {
        
    }

    public void excluirLocacao(Locacao )
    
}
