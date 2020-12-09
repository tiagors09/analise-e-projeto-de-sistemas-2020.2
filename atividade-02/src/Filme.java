abstract class Filme extends Produto{
    // Ano de lançamento do filme
    protected int anoLancamento;
    // Duração do filme é em minutos
    protected int duracao;

    public Filme(int anoLancamento, int duracao) {
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    protected int getAnoLancamento() {
        return anoLancamento;
    }

    protected void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    protected int getDuracao() {
        return duracao;
    }

    protected void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
