import java.util.ArrayList;
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

    public void inserirProduto(Produto p) {
        produtos[id] = p;
        id++;
    }

    public void comprar(int cod, int qtdp) {
        boolean existe = false;
        //verificar se produto existe
        for (int j = 0; j < produtos.length && !existe; j++)
            if(produtos[j].equals(cod))
                existe = true;

        if(!existe) {
            System.out.println("Produto não existe");
            return;
        }

        for (int k = 0; k < produtos.length; k++) {
            if(produtos[j].equals(cod)) {
                
            }
        }
    }

    public void vender() {

    }

    public void consultaPrecoVenda() {

    }

    public void listaPrecos() {

    }
}
