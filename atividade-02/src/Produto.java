abstract class Produto {
    protected String codigo;
    protected String titulo;
    protected String genero;
    protected boolean locado;

    abstract protected double calcularDiaria();
}
