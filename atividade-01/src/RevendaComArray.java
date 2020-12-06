public class RevendaComArray {
    // produtos a serem comprados
    private Produto[] produtos;
    // sindice atual da lista dos espiritos
    private int id;

    // Construtor genérico
    public RevendaComArray() {
        super();
    }

    /*
     * Construtor
     * @param qtd_prods quantidade de produtos
     */
    public RevendaComArray(int qtd_prods) {
        produtos = new Produto[qtd_prods];
        id = 0;
    }

    /*
     * Inserir produto
     * @param p produto a ser adicionado
     */
    public void inserirProduto(Produto p) {
        if(!existeProduto(p)) {
            produtos[id] = p;
            id++;
        }
    }

    /*
     * Comprar produtos
     * @param cod codigo de produto
     * @param qtdp quantiadade de produtos
     */
    public void comprar(int cod, int qtd) {
        if(existeProduto(cod))
            for (Produto produto : produtos) 
                if(produto.equals(cod))
                    produto.compra(qtd);
        else System.out.println("Error: produto nao existe");
    }

    /*
     * Verificar se o produto existe pelo codigo
     * @param cod codigo de produto
     */
     private boolean existeProduto(int cod) {
        if(id > 0)
            for (Produto produto : produtos)
                if(produto != null && produto.equals(cod))
                    return true;
                else return false;
        return false;
    }

    /*
     * verificar se o produto existe
     * se a quantidade de itens pra revenda
     * for maior que 0 então é feito uma iteração
     * percorre o array de produtos e verifica a
     * existência do produto, caso exista, retorna verdadeiro
     * @param p produto a verificar existência
     */
    private boolean existeProduto(Produto p) {
        if(id > 0)
            for (Produto produto : produtos)
                if(produto != null && produto.equals(p))
                    return true;
                else return false;
        return false;
    }
    
    /*
     * Vender produto da revenda
     * @param cod codigo do produto
     * @param qtd quantidade de produtos
     */
    public void vender(int cod, int qtd) {
        if(existeProduto(cod))
            for (Produto produto : produtos)
                if(produto.equals(cod)) {
                    produto.venda(qtd);
                    break;
                }
        else System.out.println("Error: produto nao existe");
    }

    /*
     * Consulta preço do produto pelo codigo
     * @param cod codigo do produto
     */
    public void consultaPrecoVenda(int cod) {
        if(existeProduto(cod))
            for (Produto produto : produtos)
                if(produto.equals(cod))
                    System.out.println(produto.calculaPrecoVenda());
        else System.out.println("Error: produto nao existe");
    }

    // Listar preços
    public void listaPrecos() {
        for (Produto produto : produtos) {
            if(produto != null)
                System.out.println(produto);
        }
    }

    /*
     * Altera valor de compra do produto
     * @param cod codigo do produto
     * @pram v valor de compra
     */
    public void altValorCompra(int cod, double v) {
        if(existeProduto(cod))
            for (Produto produto : produtos)
                if(produto.equals(cod)) {
                    produto.setValorCompra(v);
                    break;
                }
        else System.out.println("error: produto nao existe");
    }

    /*
     * Altera valor de compra do produto
     * @param cod codigo do produto
     * @pram c valor de custo
     */
    public void altCusto(int cod, double c) {
        if(existeProduto(cod))
            for (Produto produto : produtos)
                if(produto.equals(cod)) {
                    produto.setCusto(c);
                    break;
                }
        else System.out.println("error: produto nao existe");
    }

    /*
     * Altera valor de compra do produto
     * @param cod codigo do produto
     * @pram m valor de margem de lucro
     */
    public void altMargemLucro(int cod, double m) {
        if(existeProduto(cod))
            for (Produto produto : produtos)
                if(produto.equals(cod)) {
                    produto.setMargemLucro(m);
                    break;
                }
        else System.out.println("error: produto nao existe");
    }
}
