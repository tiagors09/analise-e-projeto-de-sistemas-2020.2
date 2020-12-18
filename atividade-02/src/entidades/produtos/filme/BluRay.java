package entidades.produtos.filme;

import entidades.produtos.abstratos.Filme;

public class BluRay extends Filme {
    private String[] idiomas = new String[2];

    /**
     * Construtor
     * @param idiomas disponiveis do filme.
     */ 
    public BluRay(String codigo, String titulo, String genero, boolean locado, int anoLancamento, int duracao, String[] idiomas) {
        super(codigo, titulo, genero, locado, anoLancamento, duracao);
        this.idiomas = idiomas;
    }

    // Retorna o(s) idioma(s) disponiveis.
    public String[] getIdiomas() {
        return idiomas;
    }

    /*
     * Inserir/altear idiomas do filme
     * @param idiomas idiomas disponiveis no filme
     */
    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    @Override
    public double calcularDiaria() {
        // TODO Auto-generated method stub
        return 0;
    }

    public String toString() {
        return super.toString()+", idiomas: "+idiomas[0]+" e "+idiomas[1];
    }
}
