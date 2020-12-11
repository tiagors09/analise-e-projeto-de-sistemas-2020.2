package basededados;

import java.util.HashMap;
import entidades.produtos.abstratos.Produto;

public final class Produtos {
    private HashMap<String, Produto> produtos = new HashMap<String, Produto>();
    private static Produtos instancia;

    public HashMap<String, Produto> getProdutos() {
        return produtos;
    }

    public static Produtos obterInstancia() {
        if(instancia == null) 
            instancia = new Produtos();
        
        return instancia;
    }
}
