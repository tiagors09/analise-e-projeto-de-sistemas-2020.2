package entidades.produtos.abstratos;

public abstract class Produto {
    /** Código do produto */
    protected String codigo;
    /** Título do produto */
    protected String titulo;
    /** Genero do produto */ 
    protected String genero;
    /** Indica se o produto está alocado ou não */
    protected boolean locado;

    /**
     * Construtor Produto
     * @param codigo do produto
     * @param titulo do produto
     * @param genero do produto
     * @param locado se o produto esta locado ou nao
     */
    public Produto(String codigo, String titulo, String genero, boolean locado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.locado = locado;
    }

    /** Calcula a diária do produto */
    abstract protected double calcularDiaria();

    /** Retorna código do produto */
    public String getCodigo() {
        return codigo;
    }

    /** 
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

    public String toString() {
        return "codigo: "+codigo+", titulo: "+titulo+", genero: "+genero+", locado: "+locado;
    }
}
