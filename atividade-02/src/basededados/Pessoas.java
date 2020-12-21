package basededados;

import java.util.HashMap;
import entidades.atores.abstratos.Pessoa;

public final class Pessoas {
    /** Banco de dados */
    private HashMap<String, Pessoa> pessoas = new HashMap<String, Pessoa>();
    /** Instancia de Pessoas */
    private static Pessoas instancia;
    
    private Pessoas() { super(); } 

    /**
     * Obtêm instância.
     * @return instancia única da classe singleton.
     */
    public static Pessoas obterInstancia() {
        if(instancia == null)
            instancia = new Pessoas();
        
        return instancia;
    }

    /**
     * Obtêm todos os dados das pessoas.
     * @return retorna um HashMap com dados de todas as pessoas cadastradas no banco.
     */
    public HashMap<String, Pessoa> getPessoas() {
        return pessoas;
    }

    /**
     * Adiciona pessoa ao banco de dados.
     * @param p pessoa a ser adicionada.
     */
    public void adicionar(Pessoa p) {
        pessoas.put(String.valueOf(p.getMatricula()), p);
    }
    
}