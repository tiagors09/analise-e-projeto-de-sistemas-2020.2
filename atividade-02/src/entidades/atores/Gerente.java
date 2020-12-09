package entidades.atores;

import entidades.atores.abstratos.Funcionario;
import entidades.produtos.abstratos.Produto;

public class Gerente extends Funcionario {
    /* Funções
     * Adicionar um cliente
     * Adicionar um produto qualquer
     * Adicionar um operador
     * Listar os clientes, produtos e operadores
     * Procurar cliente, produtos e operadores por matricula ou código
     */

    public Gerente(String nome, int matricula, String login, String senha) {
        super(nome, matricula, login, senha);
    }

    public void adicionarCliente(Cliente c) {

    }

    public void listarClientes() {
        
    }

    public void adicionarProduto(Produto p) {

    }

    public void adicionarOperador(OperadorSistema os) {
        
    }
}
