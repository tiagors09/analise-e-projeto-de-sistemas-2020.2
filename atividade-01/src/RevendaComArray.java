public class RevendaComArray {
    //produtos a serem comprados
    private Produto[] produtos;
    //indice atual da lista dos espiritos
    private int id;

    //Construtor genérico
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
     * Inserir produto pra revenda
     */
    public void inserirProduto(Produto p) {
        if(!existeProduto(p)) {
            produtos[id] = p;
            id++;
        }
    }

    public void comprar(int cod, int qtdp) {
        if(existeProduto(cod))
            for (Produto produto : produtos) 
                if(produto.equals(cod))
                    produto.compra(qtdp);
        else System.out.println("Error");
    }

    //verificar se o produto existe pelo codigo
    private boolean existeProduto(int cod) {
        if(id > 0)
            for (Produto produto : produtos)
                if(produto.equals(cod))
                    return true;
        return false;
    }

    //verificar se o produto existe
    private boolean existeProduto(Produto p) {
        if(id > 0)
            for (Produto produto : produtos)
                if(produto.equals(p))
                    return true;
        return false;
    }
    
    //Vender produto da revenda
    public void vender(int cod, int qtdUn) {
        if(existeProduto(cod))
            for (Produto produto : produtos)
                if(produto.equals(cod)) {
                    produto.venda(qtdUn);
                    break;
                }
        else System.out.println("Error");
    }

    //Consulta preço do produto
    public void consultaPrecoVenda(int cod) {
        if(existeProduto(cod))
            for (Produto produto : produtos)
                if(produto.equals(cod))
                    System.out.println(produto.calculaPrecoVenda());
        else System.out.println("Error");
    }

    //lista 
    public void listaPrecos() {
        for (Produto produto : produtos) {
            if(produto != null)
                System.out.println(produto);
        }
    }
}
