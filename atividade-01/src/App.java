import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        boolean shellAtivo = true;
        String linha;
        String[] comandos;
        RevendaComArray rev = new RevendaComArray();

        while(shellAtivo) {
            linha = in.nextLine(); 
            comandos = linha.split(" ");
            
            switch (comandos[0]) {
                case "init":
                    rev = new RevendaComArray(Integer.parseInt(comandos[1]));
                    break;
                case "in":
                    if(comandos.length-1 == 2)
                        rev.inserirProduto(new Produto(Integer.parseInt(comandos[1]), comandos[2]));
                    else if(comandos.length-1 == 5)
                        rev.inserirProduto(new Produto(Integer.parseInt(comandos[1]), comandos[2], Double.parseDouble(comandos[3]), Double.parseDouble(comandos[4]), Double.parseDouble(comandos[5])));
                    else if(comandos.length-1 == 6)
                        rev.inserirProduto(new Produto(Integer.parseInt(comandos[1]), comandos[2], Double.parseDouble(comandos[3]), Double.parseDouble(comandos[4]), Double.parseDouble(comandos[5])));
                    break;
                case "comp": 
                    rev.comprar(Integer.parseInt(comandos[1]), Integer.parseInt(comandos[2]));
                    break;
                case "vender":
                    rev.vender(Integer.parseInt(comandos[1]), Integer.parseInt(comandos[2]));
                case "cons":
                    rev.consultaPrecoVenda(Integer.parseInt(comandos[1]));
                    break;
                case "list":
                    rev.listaPrecos();
                    break;
                case "altvc":
                    rev.altValorCompra(Integer.parseInt(comandos[1]), Double.parseDouble(comandos[2]));
                    break;
                case "altcust":
                    rev.altCusto(Integer.parseInt(comandos[1]), Double.parseDouble(comandos[2]));
                    break;
                case "altmarg":
                    rev.altMargemLucro(Integer.parseInt(comandos[1]), Double.parseDouble(comandos[2]));
                    break;
                case "exit":
                    shellAtivo = false;
                default:
                    break;
            }
        }
        
    }
}
