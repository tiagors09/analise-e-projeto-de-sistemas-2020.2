package entidades.produtos.musica;

import entidades.produtos.abstratos.Musica;

public class Cd extends Musica{
    // diz se esta arranhado
    private boolean arranhado;
    // diz de cd duplo
    private boolean duplo;
    
    /**
     * Construtor CD
     * @param codigo do produto
     * @param titulo do produto
     * @param genero do produto
     * @param locado o produto esta locado ou não
     * @param autor do produto
     * @param numFaixas número de faixas do produto
     * @param arranhado o produto está arranhado ou não
     * @param duplo se o cd é duplo ou não
     */
    public Cd(String codigo, String titulo, String genero, boolean locado, String autor, int numFaixas, boolean arranhado, boolean duplo) {
        super(codigo, titulo, genero, locado, autor, numFaixas);
        this.arranhado = arranhado;
        this.duplo = duplo;
    }

    /*
     * Verifica se está arranhado
     * @param arranhado valor que diz se esta arranhado
     */
    public void setArranhado(boolean arranhado) {
        this.arranhado = arranhado;
    }

    // Diz se CD esta arranhado
    public boolean estaArranhado() {
        return arranhado;
    }

    /*
     * Altera duplicidade do cd
     * @param duplo valor que diz se cd é duplo
     */
    public void setDuplo(boolean duplo) {
        this.duplo = duplo;
    }

    // diz se o cd é duplo  
    public boolean eDuplo() {
        return duplo;
    }

    @Override
    protected double calcularDiaria() {
        // TODO Auto-generated method stub
        return 0;
    }
}
