public class Dvd extends Filme {
    private boolean arranhado;
    
    public Dvd(int duracao, int anoLancamento, boolean arranhado) {
        super(anoLancamento, duracao);
        this.arranhado = arranhado;
    }

    @Override
    public double calcularDiaria() {
        // TODO Auto-generated method stub
        return 0;
    }
}
