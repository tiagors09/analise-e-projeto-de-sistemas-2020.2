package entidades.produtos.filme;

import entidades.produtos.abstratos.Filme;

public class Vhs extends Filme {
    private boolean cores;
    
    /**
     * Construtor VHS.
     * @param anoLancamento - ano que foi lançado
     * @param duracao - duração do filme
     * @param cores -o filme tem é a cores ou não?
     */
    public Vhs(String codigo, String titulo, String genero, boolean locado, int anoLancamento, int duracao, boolean cores) {
        super(codigo, titulo, genero, locado, anoLancamento, duracao);
        this.cores = cores;
    }

    @Override
    public double calcularDiaria() {
        // TODO Auto-generated method stub
        return 0;
    }
}
