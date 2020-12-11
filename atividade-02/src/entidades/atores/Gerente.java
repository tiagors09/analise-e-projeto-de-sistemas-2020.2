package entidades.atores;

import java.util.Iterator;

import basededados.Pessoas;
import entidades.atores.abstratos.Funcionario;
import entidades.atores.abstratos.Pessoa;
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
        Pessoas.obterInstancia().adicionar(c);
    }

    public void listarClientes() {
        Iterator<Pessoa> p = Pessoas.obterInstancia().getPessoas().values().iterator();
        while(p.hasNext())
            if(p instanceof Cliente)
                System.out.println(p);
    }

    public void adicionarProduto(Produto p) {

    }

    public void listarProdutos() {

    }


    public void adicionarOperador(OperadorSistema os) {
        
    }

    public void listarOperadores() {

    }

    public void procurarOperador() {

    }
 }
