package entidades.atores;

import basededados.Locacoes;
import entidades.acao.Locacao;
import entidades.atores.abstratos.Funcionario;
import entidades.produtos.abstratos.Produto;

public class OperadorSistema extends Funcionario {

    public OperadorSistema() { super(); }

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

    /**
     * Realiza locação
     * @param p Produto
     * @param c Cliente
     */
    public void fazerLocacao(Produto p, Cliente c) {
        Locacoes.obterInstancia().adicionar(new Locacao(p.getCodigo(), c.getMatricula()));
    }

    /**
     * Realiza a exclusão de uma locação.
     * @param l locação a ser excluída
     */
    public void excluirLocacao(Locacao l) {
        
    }
    
    public void realizarCobranca() {

    }
}
