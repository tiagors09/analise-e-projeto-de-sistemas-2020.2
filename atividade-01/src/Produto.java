public class Produto {
    //código do produto
    private int codigo;
    //descrição do produto
    private String descricao;
    //custo para armazenar/benefiar o produto
    private double custo;
    //valor da compra
    private double valor_compra;
    //margem de lucro
    private double margem_lucro;
    //quantidade de unidades no estoque
    private int qtd_estoque;

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
        valor_compra = valc;
        custo = cus;
        margem_lucro = ml;
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
        valor_compra = valc;
        custo = cus;
        margem_lucro = ml;
        qtd_estoque = qtde;
    }

    //Adiciona produto ao estoque
    public void compra(int qtd) {
        qtd_estoque += qtd;
    }
    
    //Tira produto do estoque
    public void venda(int qtd) {
        qtd_estoque -= qtd;
    }

    //calcula preço da venda
    public double calculaPrecoVenda() {
        return valor_compra + custo + margem_lucro * (valor_compra + custo);
    }

    //mudar valor de compra
    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }

    //obter valor de compra
    public double getValor_compra() {
        return valor_compra;
    }

    //mudar valor de custo
    public void setCusto(double custo) {
        this.custo = custo;
    }

    //obter valor de custo
    public double getCusto() {
        return custo;
    }

    //mudar margem de lucro
    public void setMargem_lucro(double margem_lucro) {
        this.margem_lucro = margem_lucro;
    }

    //obter margem de lucro
    public double getMargem_lucro() {
        return margem_lucro;
    }

    public boolean equals(int cod) {
        return this.codigo == cod;
    }
}
