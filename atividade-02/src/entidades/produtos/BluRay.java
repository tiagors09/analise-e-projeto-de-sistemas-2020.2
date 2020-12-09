package entidades.produtos;

import entidades.produtos.abstratos.Filme;

public class BluRay extends Filme {
    private String[] idiomas = new String[2];

    /*
     * Construtor
     * @param anoLancamento ano de lançamento
     * @param duracao duração do filme
     */ 
    BluRay(int anoLancamento, int duracao) {
        super(anoLancamento, duracao);
    }

    /*
     * Construtor
     * @param anoLancamento ano de lançamento
     * @param duracao duração do filme
     * @param idiomas idiomas disponiveis no filme
     */ 
    BluRay(int anoLancamento, int duracao, String[] idiomas) {
        super(anoLancamento, duracao);
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
