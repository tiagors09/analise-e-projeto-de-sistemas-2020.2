package entidades.atores;

import basededados.Pessoas;
import basededados.Produtos;
import entidades.atores.abstratos.Funcionario;
import entidades.atores.abstratos.Pessoa;
import entidades.produtos.abstratos.Produto;

public class Gerente extends Funcionario {

    public Gerente() { super(); }

    /**
     * Construtor Gerente
     * @param nome do gerente
     * @param matricula do gerente
     * @param senha do gerente
     */
    public Gerente(String nome, int matricula, String senha) {
        super(nome, matricula, senha);
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

    /**
     * Verifica se existe uma matricula m no banco de dados de 
     * pessoas, se tiver uma instância com uma matrícula correspondente,
     * retorna uma instância de operador de sistemas.
     * @param m matricula do operador a ser procurado.
     * @return operador de sistemas, se não houver matricula no bd, retorna valor null
     */
    public Pessoa procurarOperador(String m) {
        if(Pessoas.obterInstancia().getPessoas().containsKey(m))
            return Pessoas.obterInstancia().getPessoas().get(m);
        return null;
    }
 }
