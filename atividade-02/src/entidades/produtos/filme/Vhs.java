package entidades.produtos.filme;

import entidades.produtos.abstratos.Filme;

public class Vhs extends Filme {
    /** Armazena valor sobre informação das cores */
    private boolean cores;
    
    /**
     * Construtor VHS.
     * @param codigo do produto
     * @param titulo do produto
     * @param genero do produto
     * @param locado se o produto esta locado ou nao
     * @param anoLancamento - ano que foi lançado
     * @param duracao - duração do filme
     * @param cores -o filme tem é a cores ou não?
     */
    public Vhs(String codigo, String titulo, String genero, boolean locado, int anoLancamento, int duracao, boolean cores) {
        super(codigo, titulo, genero, locado, anoLancamento, duracao);
        this.cores = cores;
    }

    /**
     * Muda informação sobre as cores do filme.
     * @param cores se é a cores ou não
     */
    public void setCores(boolean cores) {
        this.cores = cores;
    }

    /**
     * Diz de é colorido ou não.
     * @return valor se diz é a cores ou não.
     */
    public boolean eColorido() {
        return cores;
    }

    @Override
    public double calcularDiaria() {
        // TODO Auto-generated method stub
        return 0;
    }

    public String toString() {
        return super.toString() + ", cores: "+cores;
    }
}
