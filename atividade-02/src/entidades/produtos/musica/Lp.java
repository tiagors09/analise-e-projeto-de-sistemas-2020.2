package entidades.produtos.musica;

import entidades.produtos.abstratos.Musica;

public class Lp extends Musica {
    private boolean raro;
    
    public Lp(String codigo, String titulo, String genero, boolean locado, String autor, int numFaixas, boolean raro) {
        super(codigo, titulo, genero, locado, autor, numFaixas);
        this.raro = raro;
    }

    

    @Override
    protected double calcularDiaria() {
        // TODO Auto-generated method stub
        return 0;
    }
}
