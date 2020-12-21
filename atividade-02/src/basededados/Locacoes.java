package basededados;

import java.util.ArrayList;

import entidades.acao.Locacao;

public final class Locacoes {
    /** Guarda as locações */
    private ArrayList<Locacao> locacoes = new ArrayList<Locacao>();
    /** Instancia do singleton */
    private Locacoes instancia;

    /** Construtor Locacoes */
    private Locacoes() { super(); }

    /**
     * Verifica se há uma instancia do singleton, se existir 
     * retorna a mesma, senão cria uma e a retorna.
     * @return instancia do singleton
    */
    public Locacoes obterInstancia() {
        if(instancia == null)
            instancia = new Locacoes();

        return instancia;
    }
}
