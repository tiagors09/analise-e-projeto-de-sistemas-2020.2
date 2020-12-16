package basededados;

import java.util.HashMap;

import entidades.atores.OperadorSistema;
import entidades.atores.abstratos.Pessoa;

public final class Pessoas {
    /** Banco de dados */
    private HashMap<String, Pessoa> pessoas = new HashMap<String, Pessoa>();
    /** Instancia de Pessoas */
    private static Pessoas instancia;
    
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
     * Verifica se há dados de pessoa p na base de dados.
     * @param p pessoa a ser verificada.
     * @return true se a pessoa está na base de dados, ou false caso contrário.
     */
    public boolean existe(Pessoa p) {
        for (Pessoa pc : pessoas.values())
            if(pc.equals(p))
                return true;

        return false;
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