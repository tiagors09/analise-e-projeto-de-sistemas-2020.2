package basededados;

import java.util.HashMap;
import entidades.atores.abstratos.Pessoa;

public final class Pessoas {
    // Banco de dados de pessoas
    private HashMap<String, Pessoa> pessoas = new HashMap<String, Pessoa>();
    // instancia de Pessoas
    private static Pessoas instancia;
    
    // Obter instância
    public static Pessoas obterInstancia() {
        if(instancia == null)
            instancia = new Pessoas();
        
        return instancia;
    }

    public HashMap<String, Pessoa> getPessoas() {
        return pessoas;
    }

    // Adicionar
    public void adicionar(Pessoa p) {
        pessoas.put(String.valueOf(p.getMatricula()), p);
    }
    
}