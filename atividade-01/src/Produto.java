public class Produto {
    // código do produto
    private int codigo;
    // descrição do produto
    private String descricao;
    // custo para armazenar/benefiar o produto
    private double custo;
    // valor da compra
    private double valorCompra;
    // margem de lucro
    private double margemLucro;
    // quantidade de unidades no estoque
    private int qtdEstoque;

    /*
     * Construtor
     * @param cod codigo do produto
     * @param desc descrição do produto
     */
    public Produto(int cod, String desc) {
        codigo = cod;
        descricao = desc;
    }

    /*
     * Construtor
     * @param cod codigo do produto
     * @param desc descrição do produto
     * @param valc valor da compra
     * @param cus custo
     * @param ml marge de lucro
     */
    public Produto(int cod, String desc, double valc, double cus, double ml) {
        codigo = cod;
        descricao = desc;
        valorCompra = valc;
        custo = cus;
        margemLucro = ml;
    }

    /*
     * Construtor
     * @param cod codigo do produto
     * @param desc descrição do produto
     * @param valc valor da compra
     * @param cus custo
     * @param ml marge de lucro
     * @param qtde quantidade em estoque
     */
    public Produto(int cod, String desc, double valc, double cus, double ml, int qtde) {
        codigo = cod;
        descricao = desc;
        valorCompra = valc;
        custo = cus;
        margemLucro = ml;
        qtdEstoque = qtde;
    }

    /*
     * Adiciona produto ao estoque
     * @param qtd quantidade de produtos
     */
    public void compra(int qtd) {
        qtdEstoque += qtd;
    }
    
    /*
     * Tira produto do estoque
     * @param qtd quantidade de produtos
     */
    public void venda(int qtd) {
        qtdEstoque -= qtd;
    }

    // calcula preço da venda
    public double calculaPrecoVenda() {
        return valorCompra + custo + margemLucro * (valorCompra + custo);
    }

    /*
     * mudar valor de compra
     * @param v valor da compra
     */
    public void setValorCompra(double v) {
        this.valorCompra = v;
    }

    //obter valor de compra
    public double getValorCompra() {
        return valorCompra;
    }

    /*
     * muda valor de custo
     * @param c valor de custo
     */
    public void setCusto(double c) {
        this.custo = c;
    }

    //obter valor de custo
    public double getCusto() {
        return custo;
    }

    /*
     * mudar margem de lucro
     * @param m valor da margem de lucro
     */
    public void setMargemLucro(double m) {
        this.margemLucro = m;
    }

    //obter margem de lucro
    public double getMargemLucro() {
        return margemLucro;
    }

    /*
     * verifica igualdade do objeto pelo código de produto
     * @param cod codigo do produto
     */
    public boolean equals(int cod) {
        return this.codigo == cod;
    }

    public String toString() {
        return codigo+" "+descricao+" "+calculaPrecoVenda();
    }
}
