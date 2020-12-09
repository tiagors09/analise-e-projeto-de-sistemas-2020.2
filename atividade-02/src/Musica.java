abstract class Musica extends Produto {
    // autor da musica
    protected String autor;
    // número de faixas da música
    protected int numFaixas;

    // obtem autor
    protected String getAutor() {
        return autor;
    }

    /*
     * Muda autor da música
     * @param autor autor da musica
     */
    protected void setAutor(String autor) {
        this.autor = autor;
    }

    // Obtêm numero de faixas
    protected int getNumFaixas() {
        return numFaixas;
    }

    /*
     * Muda número de faixas
     * @param numFaixas numero de faixas
     */
    protected void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }
}
