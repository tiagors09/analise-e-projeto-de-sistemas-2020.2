package basededados;

import java.util.ArrayList;

import entidades.acao.Locacao;

public final class Locacoes {
    /** Guarda as locações */
    private ArrayList<Locacao> locacoes = new ArrayList<Locacao>();
    /** Instancia do singleton */
    private static Locacoes instancia;

    /** Construtor Locacoes */
    private Locacoes() { super(); }

    /**
     * Verifica se há uma instancia do singleton, se existir 
     * retorna a mesma, senão cria uma e a retorna.
     * @return instancia do singleton
    */
    public static Locacoes obterInstancia() {
        if(instancia == null)
            instancia = new Locacoes();

        return instancia;
    }

    public void adicionar(Locacao l) {
        if(locacoes.add(l))
            System.out.println(l);
        else System.out.println("ERROR: não foi possível realizar locação.");
    }

    public ArrayList<Locacao> getLocacoes() {
        return locacoes;
    }
}
