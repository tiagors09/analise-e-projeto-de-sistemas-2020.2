package entidades.produtos;

import entidades.produtos.abstratos.Filme;

public class Vhs extends Filme {
    private boolean cores;
    
    public Vhs(int anoLancamento, int duracao) {
        super(anoLancamento, duracao);
    }

    @Override
    public double calcularDiaria() {
        // TODO Auto-generated method stub
        return 0;
    }
}
