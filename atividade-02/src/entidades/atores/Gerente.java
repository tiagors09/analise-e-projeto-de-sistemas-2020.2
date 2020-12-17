package entidades.atores;

import java.util.Iterator;
import java.util.Map;

import basededados.Pessoas;
import basededados.Produtos;
import entidades.atores.abstratos.Funcionario;
import entidades.atores.abstratos.Pessoa;
import entidades.produtos.abstratos.Produto;

public class Gerente extends Funcionario {
    public Gerente(String nome, int matricula, String login, String senha) {
        super(nome, matricula, login, senha);
    }

    public void adicionarCliente(Pessoa p) {
        Pessoas.obterInstancia().adicionar(p);
    }

    public void listarClientes() {
        // Iterator<Pessoa> p = Pessoas.obterInstancia().getPessoas().values().iterator();
        // while(p.hasNext())
        //     if(p instanceof Cliente)
        //         System.out.println(p);
        for (Map.Entry<String, Pessoa> p : Pessoas.obterInstancia().getPessoas().entrySet()) {
            if(p instanceof Cliente)
                System.out.println(p);
        }
    }

    /**
     * Adiciona produtos a base de dados.
     * @param p produto a ser adicionado.
     */
    public void adicionarProduto(Produto p) {
        Produtos.obterInstancia().adicionar(p);
    }

    public void listarProdutos() {
        // Iterator<Produto> p = Produtos.obterInstancia().getProdutos().values().iterator();
        // while(p.hasNext())
        //     System.out.println(p);
        for (Map.Entry<String, Produto> p : Produtos.obterInstancia().getProdutos().entrySet())
            System.out.println(p);
            
    }


    public void adicionarOperador(OperadorSistema os) {
        
    }

    public void listarOperadores() {

    }

    public void procurarOperador() {

    }
 }
