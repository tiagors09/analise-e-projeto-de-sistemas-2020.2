package entidades.produtos.filme;

import entidades.produtos.abstratos.Filme;

public class Dvd extends Filme {
    private boolean arranhado;
    
    /**
     * Construtor DVD
     * @param codigo
     * @param titulo
     * @param genero
     * @param locado
     * @param anoLancamento
     * @param duracao
     * @param arranhado
     */
    public Dvd(String codigo, String titulo, String genero, boolean locado, int anoLancamento, int duracao, boolean arranhado) {
        super(codigo, titulo, genero, locado, anoLancamento, duracao);
        this.arranhado = arranhado;
    }

    /*
     * Verifica se está arranhado
     * @param arranhado valor que diz se esta arranhado
     */
    public void setArranhado(boolean arranhado) {
        this.arranhado = arranhado;
    }

    // Diz se dvd esta arranhado
    public boolean estaArranhado() {
        return arranhado;
    }

    @Override
    public double calcularDiaria() {
        // TODO Auto-generated method stub
        return 0;
    }
}
