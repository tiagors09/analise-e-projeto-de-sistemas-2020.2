package entidades.produtos;

import entidades.produtos.abstratos.Filme;

public class BluRay extends Filme {
    private String[] idiomas = new String[2];

    /**
     * Construtor
     * @param anoLancamento ano de lançamento
     * @param duracao duração do filme
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
}
