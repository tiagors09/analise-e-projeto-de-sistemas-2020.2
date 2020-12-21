package entidades.atores;

import java.util.Map;
import basededados.Pessoas;
import basededados.Produtos;
import entidades.atores.abstratos.Funcionario;
import entidades.atores.abstratos.Pessoa;
import entidades.produtos.abstratos.Produto;

public class Gerente extends Funcionario {
    /**
     * Construtor Gerente
     * @param nome do gerente
     * @param matricula do gerente
     * @param login do gerente
     * @param senha do gerente
     */
    public Gerente(String nome, int matricula, String login, String senha) {
        super(nome, matricula, login, senha);
    }

    /**
     * Adiciona cliente
     * @param c cliente
     */
    public void adicionarCliente(Cliente c) {
        Pessoas.obterInstancia().adicionar(c);
    }

    /** Lista clientes */
    public void listarClientes() {
        Pessoas.obterInstancia().getPessoas().entrySet().forEach(entry->{
            if(entry.getValue() instanceof Cliente)
                System.out.println(entry.getValue());
        });
    }

    /**
     * Obtêm cliente apartir da matricula
     * @param m
     * @return cliente com matricula indicada
     */
    public Pessoa procurarCliente(int m) {
        if(Pessoas.obterInstancia().getPessoas().containsKey(m))
            return Pessoas.obterInstancia().getPessoas().get(m);
        return null;
    }
    
    /**
     * Adiciona produtos a base de dados.
     * @param p produto a ser adicionado.
     */
    public void adicionarProduto(Produto p) {
        Produtos.obterInstancia().adicionar(p);
    }

    /** Lista produtos */
    public void listarProdutos() {
        Produtos.obterInstancia().getProdutos().entrySet().forEach(entry->{
            System.out.println(entry.getValue());
        });
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
     * Adiciona um operador de sistemas ao banco de dados
     * @param os operador a ser adicionado a base de dados
     */
    public void adicionarOperador(OperadorSistema os) {
        Pessoas.obterInstancia().adicionar(os);
    }

    /** Lista operadores de sistema */
    public void listarOperadores() {
        Pessoas.obterInstancia().getPessoas().entrySet().forEach(entry->{
            if(entry.getValue() instanceof OperadorSistema)
                System.out.println(entry.getValue());
        });
    }

    public OperadorSistema procurarOperador() {
        return null;
    }
 }
