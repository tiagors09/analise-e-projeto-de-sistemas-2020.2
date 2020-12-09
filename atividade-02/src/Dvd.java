public class Dvd extends Filme {
    private boolean arranhado;
    
    public Dvd(int duracao, int anoLancamento, boolean arranhado) {
        super(anoLancamento, duracao);
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
