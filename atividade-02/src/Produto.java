abstract class Produto {
    // Código do produto
    protected String codigo;
    // Título do produto
    protected String titulo;
    // Genero do produto  
    protected String genero;
    // Indica se o produto está alocado ou não
    protected boolean locado;

    // Calcula a diária do produto
    abstract protected double calcularDiaria();

    // Retorna código do produto
    protected String getCodigo() {
        return codigo;
    }

    /*
     * Insere/altera código do produto
     * @param codigo código do produto
     */
    protected void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Retorna título do produto
    protected String getTitulo() {
        return titulo;
    }

    /*
     * Insere/altera titulo do produto.
     * @param titulo titulo do produto
     */
    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Retorna gênero do produto
    protected String getGenero() {
        return genero;
    }

    /*
     * Insere/altera titulo do produto.
     * @param titulo titulo do produto
     */
    protected void setGenero(String genero) {
        this.genero = genero;
    }

    // Verifica se esta alocado
    protected boolean estaLocado() {
        return locado;
    }

    /*
     * Altera locação do produto.
     * @param locado locação do produto
     */
    protected void setLocado(boolean locado) {
        this.locado = locado;
    }
}
