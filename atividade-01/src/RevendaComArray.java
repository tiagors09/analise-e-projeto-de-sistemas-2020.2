public class RevendaComArray {
    //produtos a serem comprados
    private Produto[] produtos;
    //indice atual da lista dos espiritos
    private int id;

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
        if(existeProduto(cod)) {
            for (int k = 0; k < produtos.length; k++)
                if(produtos[k].equals(cod))
                    produtos[k].compra(1);
        }
    }

    //verificar se o produto existe pelo codigo
    private boolean existeProduto(int cod) {
        boolean existe = false;
        
        for (int j = 0; j < produtos.length && !existe; j++)
            if(produtos[j].equals(cod))
                existe = true;

        return existe;
    }

    //verificar se o produto existe
    private boolean existeProduto(Produto p) {
        boolean existe = false;
        
        for (int j = 0; j < produtos.length && !existe; j++)
            if(produtos[j].equals(p))
                existe = true;

        return existe;
    }
    
    public void vender() {

    }

    public void consultaPrecoVenda() {

    }

    public void listaPrecos() {

    }
}
