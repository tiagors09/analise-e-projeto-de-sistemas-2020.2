package basededados;

import java.util.HashMap;
import entidades.produtos.abstratos.Produto;

public final class Produtos {
    /** Banco de dados */
    private HashMap<String, Produto> produtos = new HashMap<String, Produto>();
    /** Instância de Produtos */
    private static Produtos instancia;

    /**
     * Retorna base de dados de produtos.
     */
    public HashMap<String, Produto> getProdutos() {
        return produtos;
    }

    /**
     * Obtêm instância.
     * @return obtêm instância única de produtos.
     */
    public static Produtos obterInstancia() {
        if(instancia == null) 
            instancia = new Produtos();
        
        return instancia;
    }

    /**
     * Adiciona produto ao banco de dados.
     * @param p produto a ser adicionado.
     */
    public void adicionar(Produto p) {
        produtos.put(String.valueOf(p.getCodigo()), p);
    }

}
