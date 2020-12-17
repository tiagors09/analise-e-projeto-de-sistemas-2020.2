import java.util.Scanner;

import entidades.atores.*;
import entidades.atores.abstratos.Funcionario;
import basededados.Pessoas;
import entidades.produtos.*;
public class App {
    public static void main(String[] args) throws Exception {
        // Scanner in = new Scanner(System.in);
        // boolean shellAtivo = true;
        // String linha;
        // String[] comandos;

        Gerente g = new Gerente("Tiago", 0101, "0101", "0101");
        // g.adicionarCliente(new Cliente("Tiago", 01, "Canto escuro", 19, 'M'));
        // g.listarClientes();
        g.adicionarProduto(new Vhs("3232", "Comedown Machine", "Rock", false, 2010, 60, false));
        g.listarProdutos();
    }
}
